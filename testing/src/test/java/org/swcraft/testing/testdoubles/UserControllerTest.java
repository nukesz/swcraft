package org.swcraft.testing.testdoubles;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserControllerTest {

    @Test
    public void testInvalidUser() throws Exception {
        UserAuthorizer authorizer = new RejectingUserAuthorizerStub();
        Presenter presenter = new PresenterDummy();
        UserController controller = new UserController(authorizer, presenter);
        LoginRequest request = new LoginRequest("username", "password");

        LoginResponse login = controller.login(request);

        assertThat(login.getMessage(), is(UserController.REJECT_MESSAGE));
        assertThat(login.isValid(), is(false));
    }

    @Test
    public void testInvalidUserMessageInPresenter() throws Exception {
        UserAuthorizer authorizer = new RejectingUserAuthorizerStub();
        PresenterSpy presenter = new PresenterSpy();
        UserController controller = new UserController(authorizer, presenter);
        LoginRequest request = new LoginRequest("username", "password");

        controller.login(request);

        assertThat(presenter.getLoginResponse().isValid(), is(false));
        assertThat(presenter.getLoginResponse().getMessage(), is(UserController.REJECT_MESSAGE));
    }

    @Test
    public void testValidUser() throws Exception {
        UserAuthorizer authorizer = new AcceptingUserAuthorizerStub();
        PresenterSpy presenter = new PresenterSpy();
        UserController controller = new UserController(authorizer, presenter);
        LoginRequest request = new LoginRequest("username", "password");

        controller.login(request);

        assertThat(presenter.getLoginResponse().isValid(), is(true));
        assertThat(presenter.getLoginResponse().getMessage(), is(UserController.ACCEPT_MESSAGE));
    }

    @Test
    public void testValidUsernameWithFakeAuthorizer() throws Exception {
        UserAuthorizer authorizer = new FakeUserAuthorizer();
        PresenterSpy presenter = new PresenterSpy();
        UserController controller = new UserController(authorizer, presenter);
        LoginRequest request = new LoginRequest("validusername", "password");

        controller.login(request);

        assertThat(presenter.getLoginResponse().isValid(), is(true));
    }

    @Test
    public void testInvalidUsernameWithFakeAuthorizer() throws Exception {
        UserAuthorizer authorizer = new FakeUserAuthorizer();
        PresenterSpy presenter = new PresenterSpy();
        UserController controller = new UserController(authorizer, presenter);
        LoginRequest request = new LoginRequest("invalidusername", "password");

        controller.login(request);

        assertThat(presenter.getLoginResponse().isValid(), is(false));
    }

    @Test
    public void testIfSpecificUserTriedToLogIn() throws Exception {
        UserAuthorizerMock authorizer = new UserAuthorizerMock();
        Presenter presenter = new PresenterDummy();
        UserController controller = new UserController(authorizer, presenter);
        LoginRequest request = new LoginRequest("specificUser", "password");

        controller.login(request);

        assertThat(authorizer.verifySpecificUserTriedToLogIn("specificUser"), is(true));
    }
}