import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("MyFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
