import util.MyLogger;
import util.WriteLogEntriesToLogFile;

import java.io.IOException;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        MyLogger.LOGGER.setLevel(Level.INFO);

        // MyLogger.LOGGER.info("This is my first log!");

        // MyLogger.LOGGER.warning("This is a warning log!");

        try {
            new WriteLogEntriesToLogFile().writingLogsToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
