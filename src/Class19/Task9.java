package Class19;
class Book{

    String author;
    int pageCunt;

    Book(String author){


    }
    Book(String author, int PageCount){
        this.author=author;
        this.pageCunt=PageCount;





    }
}
public class Task9 {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    public static void main(String[] args) {
        Book book1=new Book("HEMILDY");
        Book java=new Book("No know 5000");

    }


}


