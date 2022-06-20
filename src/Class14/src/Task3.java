public class Task3 {
    public static void main(String[] args) {
        // you have a string which says Is it saturday? Do we have a java class today? Is it raining?
        //how can we find out how money sentence in this String

        String sentence="Is it saturday? Do we have java class today? Is it raining?";
        System.out.println(sentence.split("[?.!]").length);

    }
}
