package Class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {

    public static void main(String[] args) {

        HashMap<String,Double> fruite=new HashMap<>();
        fruite.put("apple",2000.0);
        fruite.put("orange",2300.0);
        fruite.put("kiwi",60.90);
        fruite.put("banana",56.90);
        fruite.put("apple",90.89);

        Set<Map.Entry<String,Double>> entres=fruite.entrySet();
        for(Map.Entry<String,Double>entry:entres){
            System.out.println("entry="+entry);
        }


    }



}
