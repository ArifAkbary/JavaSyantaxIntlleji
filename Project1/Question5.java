package Project1;
// Create a 2D array of integers. Develop a program which will calculate the
//sum of  even and odd numbers for that array.
public class Question5 {
    public static void main(String[] args) {
        int [][]costs={{35,78,90,67},{23,78,90,100},{12,35,6,}};


        int sumOdd =0;
        int sumEven =0;
        for(int i=0; i<costs.length;i++){
            for(int j=0; j<costs[i].length; j++){
                if(costs[i][j]%2==0){
                    sumEven+=costs[i][j];
                }else {
                    sumOdd+=costs[i][j];
                }
            }

        }
        System.out.println("The sum of Even numbers are "+sumEven);
        System.out.println("The sum of Odd numbers are "+sumOdd);




    }





}
