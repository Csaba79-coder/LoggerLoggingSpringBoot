package util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class WriteLogEntriesToLogFile {

    public void writingLogsToFile() throws IOException {
        // boolean append = true;
        FileHandler handler = new FileHandler("default.log", true);

        MyLogger.LOGGER.addHandler(handler);

        if (MyLogger.LOGGER.isLoggable(Level.INFO)) {
            MyLogger.LOGGER.info("Information message");
        }

        if (MyLogger.LOGGER.isLoggable(Level.WARNING)) {
            MyLogger.LOGGER.warning("Warning message");
        }
    }
}
