package problems_week1;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("First String: ");
        String str1 = sc.nextLine();
        System.out.print("Second String: ");
        String str2 = sc.nextLine();

        String str = str1.concat(str2);

        System.out.print("Concatenated String: ");
        System.out.println(str);
    }

}
