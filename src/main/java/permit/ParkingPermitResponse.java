package permit;

import parkingSlot.ParkingSlot;

public class ParkingPermitResponse {
    ParkingSlot parkingSlot;
    String message;

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public ParkingPermitResponse(String message) {
        this.message = message;
    }

    public ParkingPermitResponse(String message, ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
        this.message = message;
    }
}
