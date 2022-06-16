package Class18;
public class Cow {
    String breed;
    String color;
    int age;
    double weight;
    Cow(String breed,String color, int age, double weight){
        // when we have same name varible as local and as instance inside a class
        // alwys local varible are prefered over instance varibles by java in block of code.



       this. breed=breed;
        this.color=color;
        this.age=age;
       this. weight=weight;

    }

    String getCowInfor(){
        return"Breed"+breed+"Color"+color+"Age"+age+"weight"+weight;
    }
}
