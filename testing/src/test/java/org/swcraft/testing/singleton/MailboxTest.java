package org.swcraft.testing.singleton;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MailboxTest {

    private Mailbox mailbox;

    @Before
    public void setUp() throws Exception {
        mailbox = Mailbox.getInstance();
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