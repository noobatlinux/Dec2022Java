package Week1;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        char ch;

        for(int i = 0; i < str1.length(); i++)
        {
            ch = str1.charAt(i);
            str2.insert(0, ch);
        }
        System.out.println("Reverse String is "+str2);
    }
}
