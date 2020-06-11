import Model.Vehicle;
import Parser.FileReader;
import Parser.JsonParser;

import java.util.List;

public class App {

    private FileReader fr = new FileReader();
    private JsonParser parser = new JsonParser();
    private List<Vehicle> jarmuLista;

    //1.
    public void GetList(){
        System.out.print("Fájlok beolvasása folyamatban, kérem várjon");
        loadingScreen();
        fr.readJsonFile(parser);
        jarmuLista = parser.getVehicleList();
        System.out.println("Beolvasás elkészült!");
    }

    //2.
    public void PrintList(){
        System.out.println("Járművek listája: ");
        for (Vehicle jarmu: jarmuLista
             ) {
        System.out.println(jarmu.toString());}
    }


    //loading animation
    public static void loadingScreen() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(350);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }
}



