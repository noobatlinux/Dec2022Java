package problems_week1;
import java.util.*;
public class UniqueCharactersInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            while (str2.indexOf(ch) == -1) {
                str2 = str2 + ch;
            }
        }

        System.out.print("Unique Characters: ");
        System.out.println(str2);
    }
}
