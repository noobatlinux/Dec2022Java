package problems_week1;

import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i<n; i++){

            if(n % i == 0) {
                count = count + i;
            }
        }

        if(count == n)
            System.out.println(n+" is a perfect number.");

    }
}
