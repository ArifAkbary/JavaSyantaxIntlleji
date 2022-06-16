public class MethodsDemo3 {
    public static void main(String[] args) {
        MethodsDemo3 md=new MethodsDemo3();

        System.out.println(md.checkString("Hell0"));
        System.out.println(md.isEven(80));









    }
    boolean checkString(String str){
        if(str.length()%2==0){
            return true;
        }else{
            return false;
        }
    }

  boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
  }





}
