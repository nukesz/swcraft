package org.swcraft.testing.singleton;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<String> data = new ArrayList<>();

    private Cache() {
    }

    private static class CacheHolder {
        private static final Cache INSTANCE = new Cache();
    }

    public static Cache getInstance() {
        return CacheHolder.INSTANCE;
    }

    /**
     * Add message to the cache
     * Message will be discarded if:
     * - Null
     * - Empty
     * - Longer than 20 characters
     * - Contains special & char
     * @param message to be added
     */
    public void add(String message) {
        if (message != null && !message.isEmpty() && !message.contains("&")) {
            data.add(message);
        }
    }

    public List<String> getData() {
        return data;
    }
}