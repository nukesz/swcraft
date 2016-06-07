package org.swcraft.testing.testdoubles;

public class RejectingUserAuthorizerStub implements UserAuthorizer {

    @Override
    public boolean authorize(String username, String password) {
        return false;
    }
}
