package Java8;

public class FirstImplementation implements AddInterface{

    @Override
    public void add(double a, double b) {
        System.out.println(a+b);
    }
}
