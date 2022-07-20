package Class27;

import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("bro");
        names.add("ahamd");
        names.add("Mumtaz");
        names.add("cindy");
        names.add("arif");

        for (String name : names) {
            if (name.contains("B")) {
                names.remove(name);
            }


        }
        System.out.println(names);

    }
}
