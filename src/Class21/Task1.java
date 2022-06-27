package Class21;

public class Task1 {


   // Write program: userClass  that has a constructor that initializes instance
    //variable name and mobile number. Create a subclass  userInfo that will have
   // user address variable and it also being initialized through constructor call. Print
   // users name, mobile number and address in userDetails method. Test your code.
}
class UserClass{
    String name;
    String MubileNumber;

    public UserClass(String name, String mubilenumber) {
        this.name = name;
        this.MubileNumber = mubilenumber;
    }
}
class UserInfo extends UserClass{
    String userAddress;
    UserInfo(String name,String mubilenumber, String userAddress){
      // this.userAddress=userAddress;we cant wtire any line befor the super ()line
        super(name,mubilenumber);
    }
    void printInfor(){
        System.out.println("Name" + name+ " mobile number" + MubileNumber+" user  addrsss" + userAddress);
    }

}
class Test {
    public static void main(String[] args) {
         UserInfo userInfo=new UserInfo("kalakani ","arif2323233","1232 str kalakn");
         userInfo.printInfor();
    }
}
