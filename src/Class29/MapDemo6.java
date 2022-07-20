package Class29;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruite=new HashMap<>();
        fruite.put("apple",2000.0);
        fruite.put("orange",2300.0);
        fruite.put("kiwi",60.90);
        fruite.put("banana",56.90);
        fruite.put("apple",90.89);

        Collection<Double>values=fruite.values();
        values.removeIf(value->value>60.90);{
            System.out.println(fruite);
        }



    }
}
