package problems_week1;
import java.util.*;
public class AddDigitsUntilSingleDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int m = sc.nextInt();

        AddingDigits(m);
    }
    public static void AddingDigits(int n){

        int sum = 0;
        while(n>0){
            int k = n % 10;
            sum = sum + k;
            n = n / 10;
        }
        if (sum>=10)
            AddingDigits(sum);
        else
            System.out.println(sum);
    }

}