package Project1;
//Create a 2D array or integer type where you will
//store odd and even numbers. Develop a program which will
//identify/print the even numbers only.
public class Question4 {
    public static void main(String[] args) {
        int [][] numbers={
                {12,35,67,88},
                {23,90,7,},
                {3,98,90}
        };

        for(int i=0; i<numbers.length;i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers[i][j]%2==0){
                    System.out.println(numbers [i][j]+" ");
                }
            }
        }


    }

}
