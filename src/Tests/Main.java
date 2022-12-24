package Tests;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a = sc.nextInt();
        String str = "Sai Teja";
        System.out.println(str.toLowerCase());
        for(int j=1; j<=a;j++){
            for (int i = 1; i <= j; i++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}