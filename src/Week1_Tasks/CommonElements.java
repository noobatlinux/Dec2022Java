package Week1_Tasks;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1,3,6,2};
        int[] b = {3,1,5,4};
        int[] c = new int[4];

        System.out.print("1st Array: ");
        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.print("2nd Array: ");
        for (int k : b) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.print("Common Elements are: ");

        for(int i=0;i<a.length;i++){
            for (int k : b) {
                if (a[i] == k) {
                    c[i] = a[i];
                    break;
                }
            }
        }

        System.out.print("Common Elements: ");
        for (int j : c) {
            if (j != 0) {
                System.out.print(j + " ");
            }
        }
    }
}
