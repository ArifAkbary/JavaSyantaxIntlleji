package Class28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>groceiries=new HashMap<>();
        groceiries.put("Eggs",10);
        groceiries.put("Milk",15);
        groceiries.put("Apple",8);
        groceiries.put("Fish",25);
       // System.out.println(groceiries.get("Milk"));
       // System.out.println(groceiries.get("Fish"));

        Set<String>key=groceiries.keySet();
        for(String s:key){
            System.out.println(s);
        }






    }
}
