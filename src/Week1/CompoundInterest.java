package Week1;
import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Amount: ");
        float p = sc.nextFloat();

        System.out.print("Enter Interest rate: ");
        float r = sc.nextFloat();

        System.out.print("Enter Time passed since money is deposited: ");
        float t = sc.nextFloat();

        System.out.print("Enter No. of times the money is compounded(per year): ");
        float n = sc.nextFloat();

        float x = 1 + (r/(n*100));
        float y = n * t;

        double a = (float) Math.pow(x,y);
        System.out.println(a*p);


    }
}
