package registration;

import user.User;

public class RegistrationResponse {
    private boolean isSuccessful;
    private String message;

    private User user;

    public RegistrationResponse() {
    }

    public RegistrationResponse(boolean isSuccessful, String message) {
        this.isSuccessful = isSuccessful;
        this.message = message;
    }

    public RegistrationResponse(boolean isSuccessful, String message, User user) {
        this.isSuccessful = isSuccessful;
        this.message = message;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
