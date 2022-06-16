package Class16;

public class SyntaxEmployee {
    static int EmployeID;
    static int salary;
    static String CEO="Sumair";


    public static void main(String[] args) {

        SyntaxEmployee s1= new SyntaxEmployee();
        s1.EmployeID=201;
        s1.salary=2800;
        s1.CEO="Sumair";
        System.out.println("employee number is "+EmployeID+" the salary is "+salary+" the company CEO is "+CEO);

        SyntaxEmployee s2=new SyntaxEmployee();

        s2.EmployeID=202;
        s2.salary=3100;
        s2.CEO="Sumair";
        System.out.println("employee number is "+EmployeID+" the salary is "+salary+" the company CEO is "+CEO);




    }
}

