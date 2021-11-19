import java.util.Scanner;

/*
Write a class MathOperation which accepts 5 integers through command line.
Create an array using these parameters. Loop through the array and obtain
the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
 */
public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in te array");
            int size = sc.nextInt();

            System.out.println("Enter the elemnts in the array");
            int a[] = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum = sum + a[j];
            }
            System.out.println("sum of the array elements are: " + sum);

            System.out.println("average of the array elements are: " + (sum / size));
        }
        catch (ArithmeticException obj)
        {
            System.out.println(obj);
        }
        catch (NumberFormatException obj1)
        {
            System.out.println(obj1);
        }



    }
}
