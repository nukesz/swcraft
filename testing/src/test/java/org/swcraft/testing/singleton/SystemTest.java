package org.swcraft.testing.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SystemTest {

    private System system;

    @Before
    public void setUp() throws Exception {
        system = new System();
    }

    @Test
    public void addSimpleMessage() throws Exception {
        system.receivedMessage("simple message");
        assertThat(system.shouldProcessMessages(), is(false));
    }

    @Test
    public void addNotImportantMessage() throws Exception {
        system.receivedMessage("low:hello");
        assertThat(system.shouldProcessMessages(), is(false));
    }

    @Test
    public void addImportantMessage() throws Exception {
        system.receivedMessage("high:read this please");
        assertThat(system.shouldProcessMessages(), is(true));
    }
}