package org.swcraft.testing.testdoubles;

public class LoginResponse {

    private final String username;
    private final String password;
    private boolean valid;
    private String message;

    public LoginResponse(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
