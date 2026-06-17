package exersices.chapter_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) {

        final String file = "/home/moanwer/Desktop/learn_java/exersices/chapter_17/temp.txt";

        /*
         * try (FileInputStream s = new FileInputStream(new File(file))) {
         * byte value;
         * IO.println(new File(file).length() / 1000 + " bytes");
         * byte[] chars = new byte[(int)new File(file).length()];
         * int i = 0;
         * while ((value = (byte) s.read()) != -1) {
         * chars[i] = value;
         * i++;
         * }
         * IO.println(new String(chars));
         * } catch (Exception e) {
         * }
         * //
         */
        // try (Scanner s = new Scanner(new FileInputStream(file))) {

        // while (s.hasNext()) {
        // IO.println(s.nextLine());
        // }
        // } catch (Exception e) {
        // }

        // readImageBytes();
        //readBytes();
        //writeBytes();
        fileIO();
    }

    public static void readImageBytes() {

        final String file = "/home/moanwer/Desktop/learn_java/exersices/chapter_17/r.png";

        byte[] chunks = new byte[(int) new File(file).length()];

        try (FileInputStream in = new FileInputStream(file)) {
            int data;
            int i = 0;
            while ((data = in.read()) != -1) {
                chunks[i++] =  (byte)(data);
            }
        } catch (Exception e) {
        }

        try (FileOutputStream out = new FileOutputStream(
                "/home/moanwer/Desktop/learn_java/exersices/chapter_17/new.png")) {
            out.write(chunks);

        } catch (Exception e) {
        }    
    }

    public static void readBytes() {
        final String file = "/home/moanwer/Desktop/learn_java/exersices/chapter_17/temp.txt";
        Path p = Paths.get(URI.create("file://" + file));
        try {
            byte[] content = Files.readAllBytes(p);
            IO.println(Arrays.toString(content));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    public static void writeBytes() {
        Path path = Paths.get("/home/moanwer/Desktop/learn_java/exersices/chapter_17/temp.txt");
        List<String> lines = Arrays.asList("moahmed anwer test the I/O".split("\\s"));

        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileIO() {
        String pathFromFile = new File("r.png").getAbsolutePath();
        IO.println(pathFromFile);
    }
}
