package Parser;
import Model.Bicycle;
import Model.Car;
import Model.Vehicle;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class JsonParser extends SimpleFileVisitor<Path> {

    private List<Vehicle> tempList = new ArrayList<>();
    private Gson gson = new Gson();

    public List<Vehicle> getVehicleList(){
        return this.tempList;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().charAt(0) == 'A' &&
            file.getFileName().toString().endsWith(".dat")){
            tempList.add(gson.fromJson(new FileReader(String.valueOf(file)), Car.class));
        }
        if (file.getFileName().toString().charAt(0) == 'B' &&
            file.getFileName().toString().endsWith(".dat")) {
            tempList.add(gson.fromJson(new FileReader(String.valueOf(file)), Bicycle.class));
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error accessing file: " + file.toAbsolutePath() + " " + exc.getMessage());
        return FileVisitResult.CONTINUE;
    }
}
