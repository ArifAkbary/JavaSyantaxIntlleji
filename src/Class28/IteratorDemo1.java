package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String >words =new ArrayList<>();
        words.add("hope");
        words.add("play");
        words.add("come");
        words.add("frame");
        words.add("game");
        // never use loops simple enhanced loop whenever you are planing
       // to use any method that can change the size of a list

        //for(int i=0; i<words.size(); i++){
            //if(words.get(i).endsWith("e")){
             //   words.remove(i);
           // }
        //}
       // System.out.println(words);

        Iterator<String > iterator=words.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
       System.out.println(iterator.hasNext());



    }


}


