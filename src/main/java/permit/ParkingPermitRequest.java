package permit;

import parkingSlot.ParkingSlot;
import user.User;

public class ParkingPermitRequest {
    User user;
    ParkingSlot parkingSlot;

    public boolean isValid() {
        return user.getId() != 0 &&
                parkingSlot.getSlotId() != 0 && parkingSlot.isFree();
    }

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
