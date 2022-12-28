package Experiments;

import static java.lang.Math.cos;
import static java.lang.Math.toRadians;

public class AdvancedCalculator extends Calculator{
    private static double ThirdNumber;

    public AdvancedCalculator() {
        super();
    }

    public void setThirdNumber(double thirdNumber) {
        ThirdNumber = thirdNumber;
    }

    public double sine(){
        return Math.sin(toRadians(ThirdNumber));
    }

    public double cosine(){
        return cos(toRadians(ThirdNumber));
    }

    public double tan(){
        return Math.tan(toRadians(ThirdNumber));
    }
}
