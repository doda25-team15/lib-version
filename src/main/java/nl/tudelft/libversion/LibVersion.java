package nl.tudelft.libversion;

import nl.tudelft.libversion.util.LoggerUtil;
import nl.tudelft.libversion.util.VersionUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LibVersion {

    private static final Logger LOGGER = LoggerUtil.getLogger();

    public static void main(String... args) {
        LOGGER.log(Level.INFO, VersionUtil.VERSION);
    }
}
