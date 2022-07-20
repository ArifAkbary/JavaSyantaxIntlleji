package Class28;

import java.util.ArrayList;
import java.util.Iterator;

/*
Create an arrayList of even numbers from 1 to 500.
Remove any number that is
divisible by 5 from that arrayList.
 */
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer>evenNumber=new ArrayList<>();
        for (int i = 2; i <500; i=+2) {
            evenNumber.add(i);
        }
        Iterator<Integer> iterator=evenNumber.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumber);


    }

}
