package Class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey Hamid we have found a gril for you get marreid to that girl ");
    }
}
class Hamid{
    void getMarried(){

        System.out.println(" I want to try on Tara First ");
    }

    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.getMarried();
    }
}
