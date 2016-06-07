package org.swcraft.testing.testdoubles;

public class UserController {

    public static final String REJECT_MESSAGE = "User is not authorized!";
    public static final String ACCEPT_MESSAGE = "Welcome!";

    private final UserAuthorizer authorizer;
    private final Presenter presenter;

    public UserController(UserAuthorizer authorizer, Presenter presenter) {
        this.authorizer = authorizer;
        this.presenter = presenter;
    }

    public LoginResponse login(LoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();
        boolean authorized = authorizer.authorize(username, password);
        LoginResponse response = new LoginResponse(username, password);
        response.setValid(authorized);
        if (authorized) {
            response.setMessage(ACCEPT_MESSAGE);
        } else {
            response.setMessage(REJECT_MESSAGE);
        }
        presenter.present(response);
        return response;
    }
}
