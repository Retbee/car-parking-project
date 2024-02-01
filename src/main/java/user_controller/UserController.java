package user_controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import registration.RegistrationRequest;
import registration.RegistrationResponse;
import user.UserServiceImpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserController {
    private final Gson gson = new Gson();
    private final JsonWriter jsonWriter = new JsonWriter(new FileWriter("src/main/resources/users.json"));
    private final UserServiceImpl userService;
    private boolean isExistingJsonArray = false;

    public UserController(UserServiceImpl userService) throws IOException {
        this.userService = userService;
        jsonWriter.setIndent("  ");
    }

    public boolean isExistingJsonArray() {
        return isExistingJsonArray;
    }

    public void setExistingJsonArray(boolean existingJsonArray) {
        isExistingJsonArray = existingJsonArray;
    }

//    private void createJsonArray() {
//        if (!isExistingJsonArray) {
//
//        }
//    }

    public void handleRegistrationRequest(RegistrationRequest request) {
        RegistrationResponse registrationResponse = userService.registerUser(request);
        gson.toJson(registrationResponse.getUser(), registrationResponse.getUser().getClass(),jsonWriter);
    }
}
