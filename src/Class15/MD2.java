package Class15;

public class MD2 {
    public static void main(String[] args) {
        int []arr= {10,29,29,68};

        ArrayUtils arrayUtils=new ArrayUtils();
        arrayUtils.printArray(arr);

        int sum= arrayUtils.sumArray(arr);
        System.out.println(sum);




    }
}
