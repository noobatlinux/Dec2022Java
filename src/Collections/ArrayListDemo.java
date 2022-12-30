package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(0,98);

        for (Integer i : arrayList) {
            System.out.println("Element Value: "+i);
        }
    }
}
