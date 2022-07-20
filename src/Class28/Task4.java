package Class28;

import java.util.ArrayList;

//Create an arrayList of drinks. If any drink has
// letter "a" or "e" replace it with water
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String >drinks=new ArrayList<>();
        drinks.add("Peti chia");
        drinks.add("Vodka");
        drinks.add("Whisky");
        drinks.add("Coffe");
        drinks.add("Ayran");
        drinks.add("Milke");
        drinks.add("Margarita");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
               drinks.set(i,"Water");// replaced

            }

        }
        System.out.println(drinks);


    }
}
