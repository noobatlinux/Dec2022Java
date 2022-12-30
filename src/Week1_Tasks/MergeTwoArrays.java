package Week1_Tasks;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] a = {1,3,5};
        int[] b = {2,4,7,9};

        int a_l = a.length;
        int b_l = b.length;
        int total_l = a_l + b_l;
        int[] c = new int[total_l];

        int p = 0;

        for(int i = 0; i< a.length ; i++,p++){
            c[i] = a[i];
        }

        for(int i=p,j=0; j<b.length; j++,i++){
            c[i] = b[j];
        }

        System.out.print("1st Array: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("2nd Array: ");
        for (int j : b) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("Merged Array(Not Sorted): ");
        for (int j : c) {
            System.out.print(j + " ");
        }
    }
}
