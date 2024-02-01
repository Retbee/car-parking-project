package permit_give_up;

import user.User;

public class ParkingPermitGiveUpResponse {
    String message;

    public ParkingPermitGiveUpResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
