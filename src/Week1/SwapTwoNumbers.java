package Week1;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("The Numbers are swapped. a = "+a+" and b = "+b);
    }
}
