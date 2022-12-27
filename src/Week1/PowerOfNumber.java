package Week1;
//Write a program to calculate the power of a number
import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int product = 1;

        System.out.print("Enter base: ");
        int b = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int p = sc.nextInt();
        int q = p;

        while(p>0){
            product = product * b;
            p--;
        }

        System.out.println(b+" to the power of "+q+" is "+product);
    }
}
