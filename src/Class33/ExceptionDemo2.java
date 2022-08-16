package Class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String path ="Files/config.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("the file is not correct ");
            // select the th

        }


    }


}


