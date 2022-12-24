package problems_week1;

public class NumWithEvenIndex {
    public static void main(String[] args) {
        int[] a = {34, 67, 81, 97, 45, 54, 90, 83};

        for(int i = 1; i < 8; i = i+2){
            System.out.print(a[i]+" ");
        }
    }
}
