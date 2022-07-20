package Class28;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Flower> flower =new ArrayList<>();
        flower.add(new rose());
        flower.add(new billya());
        flower.add(new Flower());

        for(Flower flower1:flower){
            flower1.bloom();
        }



    }

}
class Flower{
    void bloom(){
        System.out.println("Generally flower in spring ");
    }
}
class rose extends Flower{
    void bloom(){
        System.out.println("bloom is in the april");
    }
}
class billya extends Flower{
    void  bloom(){
        System.out.println("bloom in aquest");
    }
}

