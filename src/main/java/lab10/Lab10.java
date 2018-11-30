package lab10;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab10 {


    public Lab10() throws FileNotFoundException {
        String filename = "datasets/artists.json";
        JsonParser parser = new JsonParser();
        try(FileReader fr = new FileReader(filename)) {
            JsonElement json = parser.parse(fr);
            // do stuff here
            // e.g., if (json.isJsonObject()) { ... }
        } catch (IOException ioe) {

        }
    }
}
