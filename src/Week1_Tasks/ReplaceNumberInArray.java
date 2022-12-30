package Week1_Tasks;

import java.util.Scanner;
public class ReplaceNumberInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter "+n+" Numbers of the array: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Number to Replace: ");
        int O = sc.nextInt();
        System.out.print("Number to be Replaced: ");
        int N = sc.nextInt();

        for(int i=0;i<n;i++){
            if(a[i] == O){
                a[i] = N;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
