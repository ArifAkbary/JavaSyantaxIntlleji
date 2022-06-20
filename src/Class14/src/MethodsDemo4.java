public class MethodsDemo4 {
    public static void main(String[] args) {
        MethodsDemo4 ArifJani= new MethodsDemo4();

        System.out.println(ArifJani.sumNumbers(10,10));
       ArifJani.printManyTimes("JAN",60);


    }

    int sumNumbers(int num1, int num2) {
        return num1+num2;

    }


    void printManyTimes(String str, int times){
       for(int i=0; i<times; i++) {
           System.out.println(str);
       }
    }





}
