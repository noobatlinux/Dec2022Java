package Week1_Tasks;

import java.util.Scanner;
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
            System.out.println(n+" is an Armstrong number.");//Exercises.Armstrong
        else
            System.out.println(n+" is not an Armstrong number");

    }
}
