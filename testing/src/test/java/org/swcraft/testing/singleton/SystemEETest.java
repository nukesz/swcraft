package org.swcraft.testing.singleton;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SystemEETest {

    @Mock
    private Mailbox mailbox;

    @InjectMocks
    private SystemEE system;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addMessageToTheMailbox() throws Exception {
        system.receivedMessage("message");
        verify(mailbox).addMessage("message");
    }

    @Test
    public void doesNotContainImportantMessage() throws Exception {
        when(mailbox.containsImportantMessage()).thenReturn(false);
        assertThat(system.shouldProcessMessages(), is(false));
    }

    @Test
    public void doesContainImportantMessage() throws Exception {
        when(mailbox.containsImportantMessage()).thenReturn(true);
        assertThat(system.shouldProcessMessages(), is(true));
    }
}