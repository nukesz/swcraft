package org.swcraft.testing.testdoubles;


public interface UserAuthorizer {
    boolean authorize(String username, String password);
}
