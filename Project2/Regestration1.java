package Project2;

//Create Registration Class in which you would have variables as email,
// userName and password that have an access scope only within its own class.
// After creating an object of the class user should be able to call methods
// and in each method separately pass values to set users email, username and password.
//  Requirements:
// Valid email consider to be only yahoo
// Valid userName and password cannot be empty and should be of
// length larger than 6 characters. Also valid password cannot contain userName.

public class Regestration1 {

    private String emileAdd;
    private String userName;
    private String password;

    public String getEmileAdd() {
        return emileAdd;
    }

    public void setEmileAdd(String emileAdd) {
        this.emileAdd = emileAdd;
        if(emileAdd.contains("yahoo")){
            System.out.println("Valid email address entered ");
        }else {
            System.out.println("Please enter a yahoo emile address ");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.isEmpty()){
            System.out.println("username can not be empty");
        } else if (userName.length()<6) {
            System.out.println("Username must be more than six characters ");

        }else {
            System.out.println("Valid username entered");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if(password.isEmpty()){
            System.out.println("password can not be empty");
        } else if (password.length()<6) {
            System.out.println("password must be more than six characters");

        } else if (password.contains(userName)) {
            System.out.println("Passwoer shoud not contian username");

        }else {
            System.out.println("Valid password is enterd ");
        }


    }
    public void printInfo(){
        System.out.println("Emaile address "+this.emileAdd+ " username "+this.userName+" password "+this.password.replaceAll("[A-Za-z0-9!@#$%^&*]","*") );
    }

    public static void main(String[] args) {

        Regestration1 regestration1=new Regestration1();
        regestration1.setEmileAdd("arifakbary23@gmail.com");
        regestration1.setUserName("arifkalakani");
        regestration1.setPassword("arif");



    }
}
