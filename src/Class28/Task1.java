package Class28;

import java.util.ArrayList;

public class Task1 {
   // Create an ArrayList that will store 5 names into it.
   // Find out whether the given ArrayList is empty or not?
   // Check whether the specific name is present in an ArrayList or not?
   // Find the size of your arrayList and print all values from that
 //*
   public static void main(String[] args) {


       ArrayList<String>names=new ArrayList<>(5);//always good to specefiy intital capacity it improve
       names.add("Emre");
       names.add("arif");
       names.add("jala khan");
       names.add("peti chai");
       names.add("Zammer");

       System.out.println(names.isEmpty());
       System.out.println(names.contains("arif"));
       System.out.println(names.size());
       System.out.println(names);

   }

}
