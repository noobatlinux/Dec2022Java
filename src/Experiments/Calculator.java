package Experiments;

public class Calculator {

    private static double FirstNumber;
    private static double SecondNumber;

    public void setFirstNumber(double firstNumber) {
        FirstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        SecondNumber = secondNumber;
    }

    public double sub(){
        return FirstNumber - SecondNumber;
    }

    public double mul(){
        return FirstNumber * SecondNumber;
    }

    public double div(){
        if(SecondNumber == 0){
            SecondNumber = 1;
            return FirstNumber / SecondNumber;
        }
        return FirstNumber / SecondNumber;
    }

    public double add(){
        return FirstNumber + SecondNumber;
    }

}
