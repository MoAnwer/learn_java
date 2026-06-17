package examples.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistSerialClass {
    public static void main(String[] args) {
        String fileName = "/home/moanwer/Desktop/learn_java/examples/Serialization/time.ser";
        SerialClass time = new SerialClass(); 
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(fileName)
            );
            out.writeObject(time);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
