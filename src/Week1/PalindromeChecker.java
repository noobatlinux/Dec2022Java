package Week1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1. Check a number");
        System.out.println("2. Check a String");
        int c = sc.nextInt();

        if(c == 1){
            System.out.println("Enter a number to check: ");
            int n = sc.nextInt();
            int m = n, r = 0;

            while(n>0){

                int k = n % 10;
                r = k + (10 * r);
                n = n / 10;
            }

            if(r == m)
                System.out.println("Palindrome Number");
            else
                System.out.println("Not a Palindrome Number");
        }
        else if(c == 2){
            System.out.print("Enter a String: ");

            String str1 = sc.next();

            StringBuilder str2 = new StringBuilder();
            char ch;

            for(int i = 0; i < str1.length(); i++)
            {
                ch = str1.charAt(i);
                str2.insert(0, ch);
            }
            if(str2.toString().equals(str1)){
                System.out.println("Palindrome String");
            }
            else
                System.out.println("Not a Palindrome String");
        }

    }
}
