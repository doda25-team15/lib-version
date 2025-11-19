package nl.tudelft.libversion.util;

import java.util.logging.Logger;

public final class LoggerUtil {
    private LoggerUtil() {
    }

    private static final StackWalker STACK_WALKER = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

    /**
     * Caller sensitive.
     */
    public static Logger getLogger() {
        return Logger.getLogger(STACK_WALKER.getCallerClass().getSimpleName());
    }
}
