import java.util.Scanner;

public class BitwiseOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        // BITWISE AND OPERATOR
        System.out.println("num1&num2=" + (num1 & num2));
        // 0 1 0 1
        // 0 1 1 0
        // -------
        // 0 1 0 0=4
        // Bitwise OR operator
        System.out.println("num1|num2=" + (num1 | num2));
        // 0 1 0 1
        // 0 1 1 0
        // --------
        // 0 1 1 1=7
        // bitwise XOR operator
        System.out.println("num1^num2" + (num1 ^ num2));
        // 0 1 0 1
        // 0 1 1 0
        // -------
        // 0 0 1 1=3
        // bitwise NOT operator
        System.out.println("num1~num2" + (num1 + ~num2));
        // 0 1 0 1
        // 0 1 1 0
        // ------
        //
    }
}
