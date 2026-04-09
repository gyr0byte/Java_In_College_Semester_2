import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("MyFile.txt");
        try {
            if (file.exists()){
                System.out.println("File areadly exists..");
            }
            else{
                System.out.println("File doesn't exist, Creating a new file");
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World, I am learning file handling in java");
            writer.close();
        } 
        catch (IOException e) {
            System.out.println("Something went wrong while writing to the file!");
        }
        try {
            FileReader reader = new FileReader("./MyDetails/AboutMe.txt");
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file!");
        }
    } 
}
