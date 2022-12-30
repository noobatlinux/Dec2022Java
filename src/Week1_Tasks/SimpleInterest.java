package Week1_Tasks;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Amount: ");
        float p = sc.nextFloat();

        System.out.print("Enter Interest rate: ");
        float r = sc.nextFloat();

        System.out.print("Enter Time period(in Years): ");
        float t = sc.nextFloat();

        float i = p*t*r/100;
        float a = p + i;

        System.out.println("Interest for "+p+" is "+i+" and the final amount is "+a);
    }
}
