package Class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class Task3 {
    public static void main(String[] args) {

        Map<Integer,String> bestBuy=new TreeMap<>();
        bestBuy.put(1200,"Tv");
        bestBuy.put(1300,"Play Station");
        bestBuy.put(900,"Camera drown");
        bestBuy.put(780,"Printer");
        bestBuy.put(650,"Tv Stand");

        Set<Map.Entry<Integer,String>> entry=bestBuy.entrySet();
        for(Map.Entry<Integer,String> str:entry){
            System.out.println("BestBuy Store =" + str);
        }




    }




}
