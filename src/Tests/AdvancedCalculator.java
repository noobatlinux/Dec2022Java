package Tests;

import java.util.Scanner;

import static java.lang.Math.*;

public class AdvancedCalculator extends Calculator{
    private double ThirdNumber;

    public AdvancedCalculator() {
        super();

    }

    public double getThirdNumber() {
        return ThirdNumber;
    }

    public void setThirdNumber(double thirdNumber) {
        Scanner sc = new Scanner(System.in);
        thirdNumber = sc.nextDouble();
    }

    public static double sine(double Third){
        return sin(toRadians(Third));
    }

    public static double cosine(double Third){
        return cos(toRadians(Third));
    }

    public static double tan(double Third){
        return tan(toRadians(Third));
    }
}
