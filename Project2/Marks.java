package Project2;
//We have to calculate the average of marks obtained in three subjects
// by student A and in 4 subjects by student B. Create class ‘Marks’ with
// an abstract method ‘getAverage’ that will be returning the average of marks.
// Provide implementation of abstract method in classes ‘A’ and ‘B’.
// The constructor of student A takes the marks in three subjects as
// its parameters and the marks in four subjects as its parameters for
// student B. Test your code
abstract public class Marks {
    Marks(){}
    abstract void getAverege();
}
class StudentA extends Marks {
    int sub1;
    int sub2;
    int sub3;
    StudentA(int sub1, int sub2, int sub3) {
        super();
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    void getAverege() {
        System.out.println("The average of 3 subjects are equals to " + (sub1 + sub2 + sub3) / 3+"%");
    }
}
class StudentB extends  Marks{
    int sub1;
    int sub2;
    int sub3;
    int sub4;

    StudentB(int sub1,int sub2,int sub3, int sub4) {
        super();
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    @Override
        void getAverege(){
            System.out.println("The average of 3 subjects are equals to " + (sub1 + sub2 + sub3+sub4) /4+"%");
        }

    public static void main(String[] args) {

        Marks AhamadAverage=new StudentA(80,90,75);
        AhamadAverage.getAverege();

        Marks MohamodAverage=new StudentB(78,35,89,30);
        MohamodAverage.getAverege();

    }

    }





