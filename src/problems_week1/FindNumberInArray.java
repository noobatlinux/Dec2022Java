package problems_week1;

import java.util.*;
public class FindNumberInArray {
    public static void main(String[] args) {
        int a[] = new int[]{34, 67, 81, 97, 45, 54, 90, 83};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to Search: ");
        int n = sc.nextInt();

        for(int i=0; i< a.length ; i++){
            if(n == a[i]){
                System.out.println("Given number is present in the list at "+i); //Q3,Q5
                break;
            }
            else{
                System.out.println("Given number is not present in the list");//Q4
            }
        }
    }
}
