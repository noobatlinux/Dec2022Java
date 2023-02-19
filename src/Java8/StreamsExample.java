package Java8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        System.out.println("Program Start Time: "+ LocalDateTime.now());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<100; i++){
            list.add(i);
        }

        System.out.println("Printing without Streams");
        list.forEach(element -> {if(element > 90){
            System.out.println(element);
        }});

        System.out.println("Printing Using Sequential Streams");
        Stream<Integer> filter1 = list.stream().filter(element -> (element>90));
        filter1.forEach(System.out::println);

        System.out.println("Printing Using Parallel Streams");
        Stream<Integer> stream = list.parallelStream();
        Stream<Integer> filter2 = stream.filter(element->(element>90));
        filter2.forEach(System.out::println);
    }
}
