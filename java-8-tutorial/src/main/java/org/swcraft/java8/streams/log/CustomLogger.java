package org.swcraft.java8.streams.log;

import java.util.function.Supplier;
import org.apache.log4j.Logger;

public class CustomLogger {

    private static final Logger LOG = Logger.getLogger(CustomLogger.class);

    public boolean isDebugEnabled() {
        return LOG.isDebugEnabled();
    }

    public void debug(String message) {
        LOG.debug(message);
    }

    public void debug(Supplier<String> message) {
        if (LOG.isDebugEnabled()) {
            LOG.debug(message.get());
        }
    }

}
