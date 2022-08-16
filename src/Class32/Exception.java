package Class32;

public class Exception extends Throwable {
    public static void main(String[] args) {

        try {
            String name = null;
            //System.out.println(name.length());
            int[]arr={2};
            System.out.println(arr[5]);
        }catch (NullPointerException ss){
            System.out.println("your are trying to call a method on a null object");

        }catch (IndexOutOfBoundsException ss){
            System.out.println("please che the index that you trying to accss ");
        }catch (java.lang.Exception e){
            System.out.println(" ------");
        }

    }
}