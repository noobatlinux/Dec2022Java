package problems_week1;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1,3,6,2};
        int[] b = {3,1,5,4};
        int[] c = new int[4];

        System.out.print("1st Array: ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.print("2nd Array: ");
        for(int i=0; i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();

        System.out.print("Common Elements are: ");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[i] = a[i];
                }
            }
        }

        System.out.print("Common Elements: ");
        for(int i=0; i<c.length;i++) {
            if(c[i]!=0){
                System.out.print(c[i] + " ");
            }
        }
    }
}
