package Practice;

public class Hm1 {
   // reate a method that will accept an array as parameters and will return a sum of
   // all elements from that array. Method should be visibly only within same package
   // and accessible by the creating an instance of the class.
    void printSum(){
        int age []={12,23,23,12,12,33,56,77,99};
        int sum=0;
        for(int i=0;i<age.length; i++){
            sum+=age[i];

        }
        System.out.println("the sum of all four array element is  "+sum);

    }

    public static void main(String[] args) {
        Hm1 sum1=new Hm1();
        sum1.printSum();

    }


    }

