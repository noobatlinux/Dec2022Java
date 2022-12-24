package problems_week1;

public class AverageOfNumbers {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int sum = 0;

        for(int i=0; i<6; i++){
            sum = sum +a[i];
        }
        float average = (float) (sum / 6.0);
        System.out.println("Average: "+average);
    }
}
