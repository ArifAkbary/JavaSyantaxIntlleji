package Class16;

import Class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.name="sora";
      //  employee.salary=98900;// not it is privite
       // employee.department=// i got error because we cant not
       // access defult varible of a class inside in diferant pakge.

        System.out.println(Employee.manager);
        // static fields and method can also be accessed
       // by just calling in the sout the name like we call manger


    }





}
