package problems_week1;
import java.util.*;

//Write a program to check if the given character is a vowel or consonant
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character to check: ");
        String a = sc.nextLine();

        if(a.charAt(0)=='a' ||  a.charAt(0)=='e' ||  a.charAt(0)=='i' ||  a.charAt(0)=='o' ||  a.charAt(0)=='u'){
            System.out.println(a+" is a Vowel");
        }
        else{
            System.out.println(a+" is a Consonant");
        }
    }
}
