package Class24;

public class StudentTask1Tester {
    public static void main(String[] args) {

        Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchooolStudent()};

       // for(Student st: students){
          // st.study();
          // st.doHomeWork();
          // st.practice();
        // first one is better


           /// secand loop

            for (int i=0; i<students.length; i++){
                students[i].study();
                students[i].practice();
                students[i].doHomeWork();
            }

        }

    }

