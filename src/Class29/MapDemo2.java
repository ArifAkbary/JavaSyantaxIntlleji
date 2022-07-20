package Class29;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer>gricerues=new TreeMap<>();
        gricerues.put("Apple",20);
        gricerues.put("Water Lemon",25);
        gricerues.put("Peach",35);
        gricerues.put("strawberry",100);

        HashMap<String,Integer>beuity=new HashMap<>();
        beuity.put("foundation",20);
        beuity.put("libstick",25);
       beuity.put("mascara",35);
        beuity.put("blush",100);

        System.out.println(gricerues);
        System.out.println(beuity);





    }
}
