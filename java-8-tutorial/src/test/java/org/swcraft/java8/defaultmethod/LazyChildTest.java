package org.swcraft.java8.defaultmethod;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LazyChildTest {

    @Test
    public void testWelcome() {
        LazyChild child = new LazyChild();
        assertEquals("Child says: I'm sleeping now!", child.welcome());
    }

}
