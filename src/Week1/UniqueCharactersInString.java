package Week1;
import java.util.*;
public class UniqueCharactersInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            while (str2.toString().indexOf(ch) == -1) {
                str2.append(ch);
            }
        }

        System.out.print("Unique Characters: ");
        System.out.println(str2);
    }
}
