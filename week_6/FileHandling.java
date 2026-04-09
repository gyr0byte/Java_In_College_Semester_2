import java.io.File;
import java.io.IOException;

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
    } 
}
