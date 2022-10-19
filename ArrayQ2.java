
// 2.Write a program that creates integer array of 10 elements,
// accepts values of arrays and Find sum of all odd numbers.
import java.util.Scanner;

public class ArrayQ2 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] num = { n };
        num = new int[n];

        // int num1=sc.nextInt();
        System.out.println("enter the size of number");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("print odd numbers");
        for (int i = 0; i < n; i++) {

            // using condition to print odd number
            if (num[i] % 2 != 0) {
                // for Sum
                sum = sum + num[i];
                System.out.println("The Sum of odd num" + sum);

            }
        }

    }
}
