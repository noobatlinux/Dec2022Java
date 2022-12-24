package problems_week1;

public class DivBy235 {
    public static void main(String[] args) {
        int[] a = {34, 67, 81, 97, 45, 54, 90, 83};
        int two = 0, three = 0, five =0;

        for(int i=0; i<8; i++){
            if(a[i] % 2 == 0)
                two+=1;
            if(a[i] % 3 == 0)
                three+=1;
            if(a[i] % 5 == 0)
                five+=1;
        }
        System.out.println("count of numbers divisible by 2: "+two);
        System.out.println("count of numbers divisible by 3: "+three);
        System.out.println("count of numbers divisible by 5: "+five);
    }
}
