package org.swcraft.testing.singleton;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

@Ignore
public class CacheTest {

    private Cache cache;

    @Before
    public void setUp() throws Exception {
        cache = Cache.getInstance();
    }

    @Test
    public void addNullAsMessage() throws Exception {
        cache.add(null);
        assertThat(cache.getData().isEmpty(), is(true));
    }

    @Test
    public void addEmptyMessage() throws Exception {
        cache.add("");
        assertThat(cache.getData().isEmpty(), is(true));
    }

    @Test
    public void addOneLengthMessage() throws Exception {
        cache.add("a");
        List<String> data = cache.getData();
        assertThat(data.isEmpty(), is(false));
        assertThat(data, contains("a"));
    }

    @Test
    public void veryLongMessageShouldBeDiscarded() throws Exception {
        cache.add("veryLongMessageShouldBeDiscarded");
        List<String> data = cache.getData();
        assertThat(data.isEmpty(), is(true));
    }
}