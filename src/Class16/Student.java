package Class16;

public class Student {

    String name;
    int StudentId;
    int numberOFStudent=200;


    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Gul Agha";
        S1.StudentId=501;

        Student S2=new Student();
        S2.name="Maryam";
        S2.StudentId=502;


        Student S3=new Student();
        S3.name="Khuja Agha";
        S3.StudentId=503;
        System.out.println("His name is "+S1.name+ " his number in the class is "+ S1.StudentId + " amonge " + S1.numberOFStudent+ " students int the class");
        System.out.println("Her name is "+S2.name+ " her number in the class is "+ S2.StudentId + " amonge " + S2.numberOFStudent+ " students int the class");
        System.out.println("His name is "+S3.name+ " his number in the class is "+ S3.StudentId + " amonge " + S3.numberOFStudent+ " students int the class");


    }

}
