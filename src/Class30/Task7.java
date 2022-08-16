package Class30;
//Create a collection of integers in which you can keep duplicates.
//  .Write a logic to find sum of all integer

import java.util.LinkedList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> Num=new LinkedList<>();

      int summax=0;

        Num.add(235);
        Num.add(235);
        Num.add(678);
        Num.add(3567);
        Num.add(532);
        Num.add(2123);
        Num.add(908);
        for(Integer num:Num){
            summax+=num;
        }
        System.out.println(summax);
    }
}
