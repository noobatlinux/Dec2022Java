package problems_week1;
import java.util.*;
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int r = 0, m = n;

        while(n>0){

            int k = n % 10;
            r = k + r * 10;
            n = n / 10;
        }
        System.out.println("The reverse of "+m+" is "+r);
    }
}
