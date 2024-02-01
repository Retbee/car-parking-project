package permit_give_up;

import parkingSlot.ParkingSlot;
import user.User;

public class ParkingPermitGiveUpRequest {
    private User user;
    private ParkingSlot parkingSlot;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
