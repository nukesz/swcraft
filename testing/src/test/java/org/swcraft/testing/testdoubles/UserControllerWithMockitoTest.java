package org.swcraft.testing.testdoubles;


import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class UserControllerWithMockitoTest {

    private UserAuthorizer authorizer;
    private Presenter presenter;
    private UserController controller;

    @Before
    public void setUp() throws Exception {
        authorizer = mock(UserAuthorizer.class);
        presenter = mock(Presenter.class);
        controller = new UserController(authorizer, presenter);
    }


    @Test
    public void testInvalidUser() throws Exception {
        when(authorizer.authorize(anyString(), anyString())).thenReturn(false);
        LoginRequest request = new LoginRequest("username", "password");
        LoginResponse login = controller.login(request);

        assertThat(login.isValid(), is(false));
        assertThat(login.getMessage(), is(UserController.REJECT_MESSAGE));
    }

    @Test
    public void testInvalidUserMessageInPresenter() throws Exception {
        when(authorizer.authorize(anyString(), anyString())).thenReturn(false);
        LoginRequest request = new LoginRequest("username", "password");

        controller.login(request);

        ArgumentCaptor<LoginResponse> responseCaptor = ArgumentCaptor.forClass(LoginResponse.class);
        verify(presenter).present(responseCaptor.capture());
        LoginResponse response = responseCaptor.getValue();
        assertThat(response.isValid(), is(false));
        assertThat(response.getMessage(), is(UserController.REJECT_MESSAGE));
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
