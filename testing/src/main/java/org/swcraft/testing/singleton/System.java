package org.swcraft.testing.singleton;

public class System {

    private Mailbox mailbox = Mailbox.getInstance();

    public void receivedMessage(String message) {
        mailbox.addMessage(message);
    }

    public boolean shouldProcessMessages() {
        return mailbox.containsImportantMessage();
    }
}
