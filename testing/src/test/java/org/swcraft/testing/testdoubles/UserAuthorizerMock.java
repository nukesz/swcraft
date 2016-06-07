package org.swcraft.testing.testdoubles;


import java.util.ArrayList;
import java.util.List;

public class UserAuthorizerMock implements UserAuthorizer {

    private List<String> visitors = new ArrayList<>();

    @Override
    public boolean authorize(String username, String password) {
        visitors.add(username);
        return true;
    }

    public boolean verifySpecificUserTriedToLogIn(String username) {
        return visitors.contains(username);
    }
}
