package Practice;
public class Reverse {

    static void calculator(int a, int b, char c){//using static keyword with method we don't have to create the object of it's class when we want to call
        //that method.

        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
        }
    }

    public static void main(String[] args) {

        /*String str = "Arif";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());
*/

        calculator(5,6,'+');


    }
}
