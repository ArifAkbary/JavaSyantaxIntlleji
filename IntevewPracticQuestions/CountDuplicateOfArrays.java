package IntevewPracticQuestions;

public class CountDuplicateOfArrays {
    public static void main(String[] args) {

        int []gul={12,32,56,78,90,12,32,78};// 3 times 32,12,78 is duplicated
        counDeplicte(gul);

    }

    static void counDeplicte(int []gul){
        int counter=0;

        for(int i=0; i<gul.length; i++){
            for (int j=i+1; j<gul.length; j++){
                if(gul[i]==gul[j]){
                    counter++;
                    break;

                }
            }
        }
        System.out.println(counter);

    }
}
