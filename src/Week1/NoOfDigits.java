package Week1;

import java.util.*;
public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input Number: ");
        int m = sc.nextInt();
        int n = m, digits = 1;
        while(n>1){
            if (n%10 != 0)
                digits+=1;
            n=n/10;
        }
        System.out.println(digits);
    }
}
