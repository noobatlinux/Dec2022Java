package Experiments;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AdvancedCalculator x = new AdvancedCalculator();

        System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Sin \n 6. Cos \n 7. Tan");
        System.out.print("Input your choice:");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Enter First Number:");
                x.setFirstNumber(sc.nextDouble());
                System.out.println("Enter Second Number:");
                x.setSecondNumber(sc.nextDouble());
                System.out.println(x.add());
                break;
            case 2:
                System.out.println("Enter First Number:");
                x.setFirstNumber(sc.nextDouble());
                System.out.println("Enter First Number:");
                x.setSecondNumber(sc.nextDouble());
                System.out.println(x.sub());
                break;
            case 3:
                System.out.println("Enter First Number:");
                x.setFirstNumber(sc.nextDouble());
                System.out.println("Enter First Number:");
                x.setSecondNumber(sc.nextDouble());
                System.out.println(x.mul());
                break;
            case 4:
                System.out.println("Enter First Number:");
                x.setFirstNumber(sc.nextDouble());
                System.out.println("Enter First Number:");
                x.setSecondNumber(sc.nextDouble());
                System.out.println(x.div());
                break;
            case 5:
                System.out.println("Enter Angle:");
                x.setThirdNumber(sc.nextDouble());
                System.out.println(x.sine());
                break;
            case 6:
                System.out.println("Enter Angle:");
                x.setThirdNumber(sc.nextDouble());
                System.out.println(x.cosine());
                break;
            case 7:
                System.out.println("Enter Angle:");
                x.setThirdNumber(sc.nextDouble());
                System.out.println(x.tan());
                break;

        }
    }
}
