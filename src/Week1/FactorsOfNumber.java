package Week1;

import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int count = 0;
        System.out.print("Factors of "+n+" are: ");
        for(int i=1; i<=n; i++){
            if(n % i == 0) {
                count+=1;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        if(count == 2)
            System.out.println(n+" is a prime number.");

    }
}
