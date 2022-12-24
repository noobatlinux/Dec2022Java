package Tests;

import java.util.*;
public class GeneralSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of elements in the array:");
        int n = sc.nextInt();

        int[] sort = new int[n];
        System.out.println("Enter array numbers:");

        for(int i=0; i<n; i++) {
            sort[i] = sc.nextInt();
        }

        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n;j++){
                int temp = 0;

                if(sort[i]>sort[j]){
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }

            }
            System.out.print(sort[i]+" ");
        }
    }
}
