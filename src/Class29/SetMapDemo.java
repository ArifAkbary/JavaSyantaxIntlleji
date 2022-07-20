package Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class SetMapDemo {

    public static void main(String[] args) {
        HashMap<String,Double>fruite=new HashMap<>();
        fruite.put("apple",2000.0);
        fruite.put("orange",2300.0);
        fruite.put("kiwi",60.90);
        fruite.put("banana",56.90);
        fruite.put("apple",90.89);
        System.out.println(fruite);
        System.out.println(fruite.get("kiwi"));
        System.out.println(fruite.remove("orange"));
        System.out.println(fruite);
        System.out.println(fruite.containsKey("kiwi"));
        System.out.println(fruite.containsValue(10.50));
        System.out.println(fruite.isEmpty());
        fruite.replace("kiwi",15.67);
        System.out.println(fruite);

    }
}