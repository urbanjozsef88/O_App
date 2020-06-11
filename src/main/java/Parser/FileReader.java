package Parser;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader{

    public void readJsonFile (JsonParser parser) {
        String separator = FileSystems.getDefault().getSeparator();
        Path dataPath = FileSystems
                        .getDefault()
                        .getPath("src" + separator + "main" + separator + "java" + separator +"data");
        try {
            Files.walkFileTree(dataPath, parser);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
