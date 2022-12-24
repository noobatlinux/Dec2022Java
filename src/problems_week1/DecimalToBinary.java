package problems_week1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int n = sc.nextInt();
        int m = n;
        int[] a = new int[30];
        int i = 0;
        while(n>0){
            int k = n % 2;
            a[i] = k;
            i++;
            n=n/2;
        }
        System.out.print("Binary for "+m+" is ");
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}
