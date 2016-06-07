package org.swcraft.testing.testdoubles;

public class FakeUserAuthorizer implements UserAuthorizer {
    @Override
    public boolean authorize(String username, String password) {
        return (username != null && username.startsWith("valid"));
    }
}
