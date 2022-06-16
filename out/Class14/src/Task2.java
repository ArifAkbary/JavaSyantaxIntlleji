public class Task2 {
    public static void main(String[] args) {

        // create a string that shoud be combination of letters numbers and special charactoers.
        //find our how money Alphanumeric characters in the string .

        String Str="123567ABCDeffdjfdjj%%%%****&&&&^^^^###@@@@$$$$5675hhhhdhdhhdklgk";

        System.out.println(Str.replaceAll("[^A-Za-z0-9]","").length());






    }
}
