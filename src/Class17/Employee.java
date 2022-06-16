package Class17;

public class Employee {
    public String name;

    public static String manager="Alem";
    private int salary;
    String departments;

    private void printSalary(){
        System.out.println("Salary"+salary);

    }
    void printdepartment(){
        System.out.println("Departments"+departments);
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.name="Arif";
        emp.departments="IT Destroyer";
        emp.salary=123000;
        emp.printName();
        emp.printdepartment();
        emp.printSalary();
    }


}
