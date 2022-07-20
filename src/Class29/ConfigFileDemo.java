package Class29;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        //This demo how to read properties files
        //steps to read a file
        //1 we need know that /location of that file

        String path= "Files/config.properties";

        // navigate to that path where file is stored
        FileInputStream fileInputStream=new FileInputStream(path);

        // we need to have a special softwere which understand that
        //file we can understand use open and edite that file
        //
        Properties properties=new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        fileInputStream.close();




    }
}
