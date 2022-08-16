package Class33;

public class InSufficientFonds extends RuntimeException {
    //to create a custom exception simple create and class and extend it from
    //run time exception or any other exception if you want to create a checked exception'
    // extend from exception class otherwise runtime exception
    InSufficientFonds(String message){
        super(message);
    }

}
