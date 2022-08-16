package Project1;
// TODO Auto-generated method stub
//Create a 2D array of integer values. Print the sum of all numbers.
public class Question3 {
    public static void main(String[] args) {
        int [][]nums={
                {12,35,35},
                {35,78,90},
                {35,98,78}
        };
        int sum=0;
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums[i].length; j++){
                sum+=nums[i][j];

            }
        }
        System.out.println("The sum of all this 2D array is "+sum);


    }

}
