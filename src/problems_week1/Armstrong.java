package problems_week1;

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int m = n, sum = 0, product = 0;

        while (m > 0){
            int k = m % 10;
            product = product + k*k*k;
            sum = sum + k;
            m = m / 10;
        }

        System.out.println("The sum of digits is: "+sum);//sum of digits

        if(n == product)
            System.out.println(n+" is an Exercises.Armstrong number.");//Exercises.Armstrong
        else
            System.out.println(n+" is not an Exercises.Armstrong number");

    }
}
