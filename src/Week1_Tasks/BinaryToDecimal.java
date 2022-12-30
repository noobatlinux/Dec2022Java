package Week1_Tasks;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        int bin = sc.nextInt();
        int exp = 0,sum = 0;

        while(bin>0){
            int k = bin % 10;
            sum = (int) (sum + (k * Math.pow(2, exp)));
            bin = bin/10;
            exp++;
        }

        System.out.println("The Decimal Number is "+sum);
    }
}
