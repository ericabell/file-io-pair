import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void writeObjectToFile(Cars car) {
        try {
            File file = new File("output.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(car.getMake() + "\n");
            fileWriter.write(car.getModel() + "\n");
            fileWriter.write(car.getYear() + "\n");
            fileWriter.close();

        } catch( IOException ex ) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
	    Cars car1 = new Cars(2017, "Ford", "Mustang");

	    writeObjectToFile(car1);
    }
}
