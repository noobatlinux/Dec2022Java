package problems_week1;

public class ArrayReverse {
    public static void main(String[] args) {
        int a[] = {12, 64, 23, 35,2, 67, 9, 11};
        int l = 8;
        for(int i = l - 1; i >= 0 ; i--){
            System.out.print(a[i]);
            System.out.print(",");
        }
    }

