package org.swcraft.testing.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MailboxEETest {

    private MailboxEE mailbox;

    @Before
    public void setUp() throws Exception {
        mailbox = new MailboxEE();
    }

    @Test
    public void addSimpleMessage() throws Exception {
        mailbox.addMessage("simple message");
        assertThat(mailbox.containsImportantMessage(), is(false));
    }

    @Test
    public void addNotImportantMessage() throws Exception {
        mailbox.addMessage("low:hello");
        assertThat(mailbox.containsImportantMessage(), is(false));
    }

    @Test
    public void addImportantMessage() throws Exception {
        mailbox.addMessage("high:read this please");
        assertThat(mailbox.containsImportantMessage(), is(true));
    }
}