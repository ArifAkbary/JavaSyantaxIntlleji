package Class28;

import Class16.AccessModifiersDemo1;

import java.util.ArrayList;
import java.util.Iterator;

/*
Create an arrayList of cars and retrieve all the values using 3 different ways
 */
public class Task2 {
    public static void main(String[] args) {


        ArrayList<String> cars=new ArrayList<>();
        cars.add("Tezla");
        cars.add("Audi");
        cars.add("Togg");
        cars.add("Toyota");
//1
       for (String car:cars){
           System.out.println(car);
       }
       //2
      for(int i=0; i<cars.size(); i++){
          System.out.println(cars.get(i));
      }
      //3
        System.out.println(cars);

      //4
        Iterator<String >iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}
