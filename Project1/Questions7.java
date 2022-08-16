package Project1;
// Write a java program to check whether a given number is prime or not?
public class Questions7 {
    public static void main(String[] args) {
        int a = 56789;
        boolean isPrime;
        if (a > 1) {
            if (a % 2 != 0) {
                isPrime = true;
            } else
                isPrime = false;
            System.out.println("Is this number is prime "  + isPrime);

        }

    }

}
