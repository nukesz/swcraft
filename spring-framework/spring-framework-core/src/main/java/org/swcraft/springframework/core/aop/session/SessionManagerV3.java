package org.swcraft.springframework.core.aop.session;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class SessionManagerV3 {

    private static final Logger LOGGER = Logger.getLogger(SessionManagerV3.class.getName());

    private List<String> sessions = new ArrayList<>();

    public SessionManagerV3() {
        LOGGER.info("SessionManager has been created");
    }

    public String createSession() {
        long startTime = System.currentTimeMillis();
        LOGGER.info("Creating new session");
        String session = UUID.randomUUID().toString();
        sessions.add(session);
        LOGGER.info("New session has been created: " + session);
        long elapsedTime = System.currentTimeMillis() - startTime;
        LOGGER.info("Elapsed time createSession: " + elapsedTime);
        return session;
    }

    public boolean isSessionValid(String session) {
        long startTime = System.currentTimeMillis();
        boolean valid = sessions.contains(session);
        if (valid) {
            LOGGER.info("Input session (" + valid + ") is valid");
        } else {
            LOGGER.info("Input session (" + valid + ") is not valid");
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        LOGGER.info("Elapsed time isSessionValid: " + elapsedTime);
        return valid;
    }

    public void invalidateSession(String session) {
        long startTime = System.currentTimeMillis();
        LOGGER.info("Invalidation session: " + session);
        sessions.remove(session);
        long elapsedTime = System.currentTimeMillis() - startTime;
        LOGGER.info("Elapsed time elapsedTime: " + elapsedTime);
    }
}
