package Class24;

public class DatabaseTester {

    public static void main(String[] args) {

        Database[]databases={new MySQLServer(),new Database.Infromix()};

        for(Database database :databases){
            database.open();
            database.readData();
            database.writeData();
            database.closeTheDatabase();




        }


    }



}
