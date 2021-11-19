import java.util.Scanner;

/*
Write a program to accept name and age of a person from the command prompt(passed as arguments
when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
 */
public class PersonError extends RuntimeException
{
    PersonError(String S)
    {
        super(S);
    }
}
class NameAge
{
    public static void main(String[] args) {
        String Name;
        int Age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person");
        Name = sc.next();
        System.out.println("Enter the age of person");
        Age = sc.nextInt();
      try
      {
          if(Age>=18 && Age<60)
          {
              System.out.println("proper Error message");
          }
          else
          {
              throw new PersonError("Not proper");
          }
      }
      catch (PersonError obj)
      {
          System.out.println("Person Error");
      }
    }
}
