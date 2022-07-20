package Class25;

public interface Animal {
    void sleep();
    void eat();

}
interface Dog extends Animal{
    void Brak();

}
class Husky implements Dog{

    public Husky() {
        super();
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void Brak() {

    }
}
