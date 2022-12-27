package Tests;

import java.util.Scanner;

public class Calculator {

    private static double FirstNumber;
    private static double SecondNumber;

    public double getFirstNumber() {
        return FirstNumber;
    }

    public void setFirstNumber() {
        Scanner sc = new Scanner(System.in);
        FirstNumber = sc.nextDouble();
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber() {
        Scanner sc = new Scanner(System.in);
        FirstNumber = sc.nextDouble();
    }

    public static double sub(){
        System.out.println(FirstNumber - SecondNumber);
        return FirstNumber - SecondNumber;
    }

    public static double mul(double First, double Second){
        return First * Second;
    }

    public static double div(double First, double Second){
        if(Second != 0)
            return First + Second;
        else{
            Second = 1;
            return First/Second;
        }
    }

    public static double add(double First, double Second){
        return First + Second;
    }

}
