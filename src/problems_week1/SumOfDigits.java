package problems_week1;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            int k = n % 10;
            sum = sum + k;
            n = n / 10;
        }
        System.out.println("sum of digits is "+sum);
    }
}
