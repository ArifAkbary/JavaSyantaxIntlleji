package Class30;

import java.util.LinkedHashMap;

//reate a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
      //  Check how many entries you have?
      //  Update company on a 4th floor
       // Remove company on the 7th floor
       // Print your map
public class Task1 {
      public static void main(String[] args) {
            LinkedHashMap<Integer,String>Building=new LinkedHashMap<>();
            Building.put(1,"Google");
            Building.put(3,"Syntax");
            Building.put(4,"Google");
            Building.put(5,"Amazon");
            Building.put(1,"Google");
            Building.put(1,"Google");
            System.out.println(Building.size());
            Building.replace(5,"YOutube");
            Building.remove(4);
            System.out.println(Building);


      }

}
