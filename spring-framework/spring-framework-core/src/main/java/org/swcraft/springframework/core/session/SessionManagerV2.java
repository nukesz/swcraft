package org.swcraft.springframework.core.session;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class SessionManagerV2 {

    private static final Logger LOGGER = Logger.getLogger(SessionManagerV2.class.getName());

    private List<String> sessions = new ArrayList<>();

    public SessionManagerV2() {
        LOGGER.info("SessionManager has been created");
    }

    public String createSession() {
        LOGGER.info("Creating new session");
        String session = UUID.randomUUID().toString();
        sessions.add(session);
        LOGGER.info("New session has been created: " + session);
        return session;
    }

    public boolean isSessionValid(String session) {
        boolean valid = sessions.contains(session);
        if (valid) {
            LOGGER.info("Input session (" + valid + ") is valid");
        } else {
            LOGGER.info("Input session (" + valid + ") is not valid");
        }
        return valid;
    }

    public void invalidateSession(String session) {
        LOGGER.info("Invalidation session: " + session);
        sessions.remove(session);
    }
}
