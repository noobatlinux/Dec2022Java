package Tests;

import Tests.AdvancedCalculator;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AdvancedCalculator x = new AdvancedCalculator();

        System.out.println("\\n1. Addition \\n2. Subtraction \\n3. Multiplication \\n4. Division \\n5. Sin \\n6. Cos \\n7. Tan");
        int n = sc.nextInt();
        switch (n){
            case 1:
                x.setFirstNumber();
                x.setSecondNumber();
                System.out.println(x.add(x.getFirstNumber(),x.getSecondNumber()));
                break;
            case 2:
                x.setFirstNumber();
                x.setSecondNumber();
                System.out.println(x.sub());
                break;
            case 3:
                System.out.println(x.mul(x.getFirstNumber(),x.getSecondNumber()));
                break;
            case 4:
                System.out.println(x.div(x.getFirstNumber(),x.getSecondNumber()));
                break;
            case 5:
                System.out.println(x.sine(x.getThirdNumber()));
                break;
            case 6:
                System.out.println(x.cosine(x.getThirdNumber()));
                break;
            case 7:
                System.out.println(x.tan(x.getThirdNumber()));
                break;

        }
    }
}
