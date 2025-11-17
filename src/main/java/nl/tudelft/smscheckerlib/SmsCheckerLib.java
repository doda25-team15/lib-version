package nl.tudelft.smscheckerlib;

import nl.tudelft.smscheckerlib.util.LoggerUtil;
import nl.tudelft.smscheckerlib.util.VersionUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SmsCheckerLib {

    private static final Logger LOGGER = LoggerUtil.getLogger();

    public static void main(String... args) {
        LOGGER.log(Level.INFO, VersionUtil.VERSION);
    }
}
