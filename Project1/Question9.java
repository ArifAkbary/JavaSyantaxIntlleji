package Project1;

import java.util.Map;

// Find out the Maximum and minimum number in the array?
//let make array which several  numbers inside;
public class Question9 {
    public static void main(String[] args) {
        int []numbers={12,35,67,2,255,56,78,9,76,87,590};
        int mix=numbers [0];
        int min= numbers[0];


        for(int arif:numbers){
            if(mix<arif)mix=arif;
            if(min>arif)min=arif;

        }
        System.out.println("the large number is "+mix);
        System.out.println("the smales number is "+min);



    }
}
