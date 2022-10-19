
//1.Program to input 10 numbers in an array and display only the even numbers if present in the array.
import java.util.Scanner;

class ArraysQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("take element from the user");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        // check condition
        System.out.println(" print even numbers");
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            } 
        }

    }
}