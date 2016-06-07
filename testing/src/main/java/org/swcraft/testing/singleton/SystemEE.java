package org.swcraft.testing.singleton;


import javax.inject.Inject;

public class SystemEE {

    @Inject
    private Mailbox mailbox;

    public void receivedMessage(String message) {
        mailbox.addMessage(message);
    }

    public boolean shouldProcessMessages() {
        return mailbox.containsImportantMessage();
    }
}
