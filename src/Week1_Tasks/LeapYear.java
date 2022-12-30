package Week1_Tasks;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year(to check if it is a leap year or not): ");
        int a = sc.nextInt();

        if((a % 4) == 0)
            System.out.println(a+" is a Leap year");
        else
            System.out.println(a+" is not a Leap Year");
    }
}
