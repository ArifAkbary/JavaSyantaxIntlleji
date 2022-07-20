package Class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {


    public static void main(String[] args) {

        List<String> legends=new ArrayList<>();// recoomanded
        legends.add("Hamid");
        legends.add("Arif");
        legends.add("abdul");
        legends.add("Arif");
        legends.add("Aeemal");

        System.out.println(legends.get(1));
        System.out.println(legends.get(3));
        System.out.println(legends);

      legends.set(0,"gul agha");
        System.out.println(legends);
        System.out.println(legends.indexOf("Arif"));// got the index of first one
        // intersted the last arif
        System.out.println(legends.lastIndexOf("Arif"));
        System.out.println(legends.subList(0,3));


    }
}
