package Java8;

public class LambdaImplementation{

    public static void main(String[] args) {

        AddInterface a1 = (a,b) -> System.out.println("First Adhoc Implementation: "+(a+b));
        AddInterface a2 = (first,second) -> System.out.println("Second Adhoc Implementation: "+(first+second));

        a1.add(23.4,32.8);
        a2.add(43.9,2-1.1);
    }

}
