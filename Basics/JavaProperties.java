import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("email", "john@gmail.com");

        String s = properties.getProperty("email");

        IO.println(s);

        properties.remove("email");

        IO.println(properties.getProperty("email"));

        properties.setProperty("property1", "value1");
        properties.setProperty("property2", "value2");
        properties.setProperty("property3", "value3");
        
        try (FileWriter output = new FileWriter("/home/moanwer/Desktop/learn_java/Basics/data/props.properties")) {
            properties.store(output, " COMMENT");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
