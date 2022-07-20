package Class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(23);
        numbers.add(35);
        numbers.add(78);
        numbers.add(89);
        numbers.add(45);


        //when we pass the list to the constructoer of the set and
        //java

        numbers=new ArrayList<>(new LinkedHashSet<>(numbers));
       // LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
       // linkedHashSet.addAll(numbers);
        //numbers=new ArrayList<>();

        //numbers.addAll(linkedHashSet)


        System.out.println(numbers);



    }
}
