import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AboutMe {
    public static void main(String[] args) {
        File file = new File("./MyDetails/AboutMe.txt");
        try {
            if (file.exists()) {
                System.out.println("File areadly exists..");
            } else {
                System.out.println("File doesn't exist, Creating a new file");
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("My name is Gaurav Dulal\n");
            writer.write("I study in Itahari International College\n");
            writer.write("I love programming");
            writer.close();
        } catch (IOException e) {
            System.out.println("Something went wrong while writing to the file!");
        }
        
    }
}