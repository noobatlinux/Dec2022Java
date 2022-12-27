package Week1;

import java.util.Scanner;

public class AvgOfNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of Elements in Array: ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" Array elements: ");
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.print("Sum of all elements: ");
        System.out.println(sum);
    }
}
