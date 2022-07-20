package Class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String>legends=new ArrayList<>();// WE CAN STORE THE OBJECT OF THE CALLSS INSIDE
        // PARENT CLASS INTERFACE IF
        legends.add("Hamid");
        legends.add("Arif");
        legends.add("abdul");
        legends.add("Aeemal");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Hamid"));

        System.out.println(legends);

        List<String> someStudents =new ArrayList<>();
        someStudents.add("Jani");
        someStudents.add("Alex");

        System.out.println(legends.containsAll(someStudents));





    }


}
