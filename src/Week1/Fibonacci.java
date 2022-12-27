package Week1;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = 1, b = 2, c = 0;
        System.out.println(a);
        System.out.println(b);
        while(c < n){
            c = a + b;
            a = b;
            b = c;
            if (c<n) {
                System.out.println(c);
            }
        }
    }
}
