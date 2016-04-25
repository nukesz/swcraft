package org.swcraft.java8.defaultmethod;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FriendlyParentTest {

    @Test
    public void testWelcome() {
        FriendlyParent parent = new FriendlyParent();
        assertEquals("Parent says: Have a nice day!", parent.welcome());
    }

}
