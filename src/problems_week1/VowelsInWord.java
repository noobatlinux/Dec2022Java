package problems_week1;
import java.util.Scanner;
public class VowelsInWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = 0;
        int l = str.length();

        for(int i=0;i<l;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("No of Vowels in "+str+" are "+count);
    }
}
