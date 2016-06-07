package org.swcraft.testing.singleton;


import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MailboxEE {

    private List<String> messages = new ArrayList<>();
    private boolean containsImportantMessage = false;

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
}
