package parking_service;

import parkingSlot.ParkingSlot;
import permit.ParkingPermitRequest;
import permit.ParkingPermitResponse;
import permit_give_up.ParkingPermitGiveUpRequest;
import permit_give_up.ParkingPermitGiveUpResponse;

import java.io.IOException;
import java.util.List;

public interface ParkingService {
    List<ParkingSlot> getAvailableParkingSlot() throws IOException;
    ParkingPermitResponse takeParkingPermit(ParkingPermitRequest parkingPermitResponse);
    ParkingPermitGiveUpResponse giveUpParkingPermit(ParkingPermitGiveUpRequest parkingPermitGiveUpRequest, ParkingSlot parkingSlot);

}
