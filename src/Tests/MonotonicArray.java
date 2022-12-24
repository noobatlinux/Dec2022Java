package Tests;

import java.util.Scanner;

public class MonotonicArray {
    public static int fact(int n){
        int m = 1;
        for(int i=1;i<=n;i++){
            m = m * i;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Elements in Array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        int count;
        count = fact(n)/(fact(n-2)*2);
        int yolo = count;

        System.out.println("Enter "+n+" Elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    count--;
                }
                if(a[i]>=a[j]){
                    yolo--;
                }
            }
        }

        if(count==0 || yolo==0){
            System.out.println("Given Array is a Monotonic Array");
        }
        else{
            System.out.println("Given Array is not a Monotonic Array");
        }
    }
}
