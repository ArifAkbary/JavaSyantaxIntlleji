package Class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Create a property file to store following configurations:
       // browser=chrome
       // url=https://facebook.com
       // username
       // password
public class Task1 {

    public static void main(String[] args) throws IOException {
        String path="Files/Task.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("full"));
        System.out.println(properties.getProperty("username"));
    }
}
