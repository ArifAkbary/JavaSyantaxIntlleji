package Class24;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlock();

    void sendText(){
        System.out.println("Use the maassge app to send the SMS");
    }


}
 class  Iphone extends Phone{
    void displayPictures(){
        System.out.println("Use the photo app to display the Pictures");
    }
    void unlock(){
        System.out.println("Face id to unlock Phone ");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("We display pic by garary Apps");
    }

    @Override
    void unlock() {
        System.out.println("Use finger print sensor to unluck our Phone ");
    }
}
class Tester{
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.displayPictures();;
        samsung.unlock();

        Iphone appleiphone=new Iphone();
        appleiphone.displayPictures();
        appleiphone.unlock();

    }
}
