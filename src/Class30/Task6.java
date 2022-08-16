package Class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task6 {


    public static void main(String[] args) {
        LinkedHashSet<String> fullname = new LinkedHashSet<>();
        fullname.add("Mohammad");
        fullname.add("arif");
        fullname.add("akbary");
        fullname.add("kalakani");
        System.out.println(fullname);
        System.out.println("--------------");

        StringBuilder allValues= new StringBuilder();
        String[] collection = new String[0];
        for (String value:fullname
        ) {
            allValues.append(value);
        }
        System.out.println(allValues);
    }
}




