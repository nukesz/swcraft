package org.swcraft.springframework.core.aop.session;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SessionManager {

    private List<String> sessions = new ArrayList<>();

    public String createSession() {
        String session = UUID.randomUUID().toString();
        sessions.add(session);
        return session;
    }

    public boolean isSessionValid(String session) {
        return sessions.contains(session);
    }

    public void invalidateSession(String session) {
        sessions.remove(session);
    }
}
