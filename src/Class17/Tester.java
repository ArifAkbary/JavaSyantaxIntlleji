package Class17;

import Class16.Dog;

public class Tester {
    public static void main(String[] args) {





        Employee employee= new Employee();
        employee.name="Arif";
        //employee.salary//// becuse in our class is privite
        employee.printdepartment();
        employee.departments="IT saver";
        ///employee.printSalary=// not access becuse we said there it is private


        // if clasee exist inside the dame pakage they ae imported automatically
        // if not in pakaage we can import form others like dogs class

        Dog dog=new Dog();// WE SEE THE IMPORTED ON THE TOP





    }
}
