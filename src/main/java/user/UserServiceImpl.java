package user;

import registration.RegistrationRequest;
import registration.RegistrationResponse;

public class UserServiceImpl implements UserService {
    @Override
    public RegistrationResponse registerUser(RegistrationRequest registrationRequest) {
        if (registrationRequest.isValid()) {
            return new RegistrationResponse(true,
                    "You have been registered", registrationRequest.getUser());
        } else {
            return new RegistrationResponse(false, "Failed to register. Please check your data");
        }
    }
}
