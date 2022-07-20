package Class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> legends=new ArrayList<>();// recoomanded
        legends.add("Hamid");
        legends.add("Arif");
        legends.add("abdul");
        legends.add("Aeemal");

        ArrayList<String>moreStudent=new ArrayList<>();
        moreStudent.add("Jason");
        moreStudent.add("Hundun");

        ArrayList<String>allStudent=new ArrayList<>();
        allStudent.add("jani");
        allStudent.add("max");

        // how can we call of them to print

        allStudent.addAll(legends);
        allStudent.addAll(moreStudent);
        System.out.println(allStudent);
        System.out.println(legends);
        System.out.println(moreStudent);










    }



}
