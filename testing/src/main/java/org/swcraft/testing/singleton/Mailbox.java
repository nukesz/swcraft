package org.swcraft.testing.singleton;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {

    private List<String> messages = new ArrayList<>();
    private boolean containsImportantMessage = false;

    private Mailbox() {
    }

    public static Mailbox getInstance() {
        return CacheHolder.INSTANCE;
    }

    /**
     * Add message to the mailbox
     * Important messages start with 'high:'
     *
     * @param message to be added
     */
    public void addMessage(String message) {
        if (message != null && message.startsWith("high:")) {
            containsImportantMessage = true;
        }
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }

    public boolean containsImportantMessage() {
        return containsImportantMessage;
    }

    private static class CacheHolder {
        private static final Mailbox INSTANCE = new Mailbox();
    }
}