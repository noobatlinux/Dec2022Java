package Week1_Tasks;

import java.util.Scanner;

public class StringMergeAlternate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        String str = "";

        int n = Math.max(str1.length(), str2.length());

        for (int i=0;i<n;i++){

            if(i<str1.length()) {
                str = str + str1.charAt(i);
            }

            if(i<str2.length()) {
                str = str + str2.charAt(i);
            }
        }

        System.out.println(str);
    }
}
