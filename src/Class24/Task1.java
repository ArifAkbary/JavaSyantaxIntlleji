package Class24;

public class Task1 {
/*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */




}
class Student{
    void study(){
        System.out.println("Student must study");
    }

    void doHomeWork(){
        System.out.println("student shoud do homeworks");
    }
    void practice(){
        System.out.println("students must practice");
    }


}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("syntax student must learn programming");
    }
    void dohomeWork(){
        System.out.println("Syntax student must solve the replt to get a good job");
    }
    void Practice(){
        System.out.println("Syntax students must practice to get a good job");
    }
}
class CollegeStudent extends Student{

    void practice(){
        System.out.println("colllege student must practice to get good grade");
    }


}
class SchooolStudent extends Student{


}
