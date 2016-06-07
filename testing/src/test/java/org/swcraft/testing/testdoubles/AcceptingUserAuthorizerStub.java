package org.swcraft.testing.testdoubles;

public class AcceptingUserAuthorizerStub implements UserAuthorizer {

    @Override
    public boolean authorize(String username, String password) {
        return true;
    }
}
