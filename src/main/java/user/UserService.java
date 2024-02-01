package user;

import registration.RegistrationRequest;
import registration.RegistrationResponse;

public interface UserService {
    RegistrationResponse registerUser(RegistrationRequest registrationRequest);
}
