package Week1;

public class HighLowDiff {
    public static void main(String[] args) {
        int[] a = {1, 15, -1, 23, 45, 70, 99, -13, -5};
        int l = 9, k = a[1], h = a[1];

        for(int i = 0; i < l; i++){
            if(a[i]<k) {
                k = a[i];
            }
            if(a[i]>h){
                h = a[i];
            }
        }
        k=h-k;
        System.out.println("Difference: "+k);
    }
}
