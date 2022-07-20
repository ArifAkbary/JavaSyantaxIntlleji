package Class25;

public class Task1 {
   // reate a class File that will have the following behaviors:
    //open, edit, close. Edit and close are implemented method while open is an abstract.
   // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    //Example: to open .java file we need notepad++ or sublime text, to open .doc file
    //we need Microsoft Word to be installed etc
 //*/

    public static void main(String[] args) {
File []files={new JavaFile(),new WorldFile(),new FDFfile()};
for(File f:files){
    f.close();
    f.edit();
    f.open();
}
    }
}
 abstract  class File {
     abstract void open();

     void edit() {
         System.out.println("Editing the file");
     }

     void close() {
         System.out.println("Closing the file");
     }

 }
class JavaFile extends File{
    void open(){
        System.out.println("Use Inteliji to open java file");
    }
}
class WorldFile extends  File{
    @Override
    void open() {
        System.out.println("Use Microsoft word to open word file");
    }
}
class FDFfile extends File{
    @Override
    void open() {
        System.out.println("Use adope reader to open PDF");
    }
}