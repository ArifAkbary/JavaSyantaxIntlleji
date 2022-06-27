package Class24;

abstract public class Database {
abstract void open();
abstract void readData();
abstract boolean writeData();
public void closeTheDatabase(){

    System.out.println("Terminate the connectons to close it ");

}
static class Infromix extends Database{


    @Override
    void open() {
        System.out.println("opeing the infromix database class");
    }

    @Override
    void readData() {
        System.out.println("reading the data from the informix");

    }

    @Override
    boolean writeData() {

        System.out.println("data written successfully ");
        return false;
    }
}

}
class MySQLServer extends Database{


    @Override
    void open() {
        System.out.println("opeing the infromix database class");

    }

    @Override
    void readData() {
        System.out.println("reading the data from the informix");

    }

    @Override
    boolean writeData() {
        System.out.println("data written successfully ");
        return false;
    }
}
