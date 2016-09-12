package org.swcraft.testing.testdoubles;

public class PresenterSpy implements Presenter {

    private LoginResponse response;

    @Override
    public void present(LoginResponse response) {
        this.response = response;
    }

    public LoginResponse getLoginResponse() {
        return response;
    }
}
