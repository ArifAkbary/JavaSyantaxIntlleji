package Class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadDemo {
    public static void main(String[] args) throws IOException {
        // right click in dirctory or pakage new file give any name and extenasion

        // right claick in the file
        //click on get path referance
        //select content root path
        String path="Files/config.properties";
        // navagate to this location with the hlep of file input stream class
        // if we want to read the data or file out stream i we want to write the datat


        FileInputStream fileInputStream=new FileInputStream(path);

        // now we need a class that understand how to read the data from this file
        // type

        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("password"));
        // CLOSE THIS FILE TO SAVE SYSTEM resource
        fileInputStream.close();









    }
}
