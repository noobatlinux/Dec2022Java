package Week1_Tasks;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int j=1; j<=n; j++){
            if(n % j == 0) {
                count+=1;
            }
        }
        if (count == 2) {
            System.out.println("prime");
        }
        else
            System.out.println("not prime");
    }
}
