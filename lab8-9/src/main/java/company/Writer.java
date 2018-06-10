package company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<SportsObject> sportsObjectsList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("E:\\fortest/list.csv"))) {
            sportsObjectsList.forEach((SportsObject sportsObject) -> {
                writer.println(sportsObject.getHeaders());
                writer.println(sportsObject.toCVS());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
