package parking_service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import parkingSlot.ParkingSlot;
import permit.ParkingPermitRequest;
import permit.ParkingPermitResponse;
import permit_give_up.ParkingPermitGiveUpRequest;
import permit_give_up.ParkingPermitGiveUpResponse;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingServiceImpl implements ParkingService {
    @Override
    public List<ParkingSlot> getAvailableParkingSlot() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<ParkingSlot> parkingSlots = objectMapper.readValue(new FileReader("src/main/resources/parking_slots.json"), new TypeReference<>() {
            });
            return parkingSlots.stream()
                    .filter(ParkingSlot::isFree)
                    .collect(Collectors.toList());
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public ParkingPermitResponse takeParkingPermit(ParkingPermitRequest parkingPermitRequest) {
        if (parkingPermitRequest.isValid()) {
            return new ParkingPermitResponse("Access to parking slot granted", parkingPermitRequest.getParkingSlot());
        } else {
            return new ParkingPermitResponse("Access to parking slot denied");
        }
    }

    @Override
    public ParkingPermitGiveUpResponse giveUpParkingPermit(ParkingPermitGiveUpRequest parkingPermitGiveUpRequest, ParkingSlot parkingSlot) {
        if (parkingPermitGiveUpRequest.getUser().getParkingSlot().getSlotId() == parkingSlot.getSlotId()) {
            return new ParkingPermitGiveUpResponse("Your parking permit was successfully deleted");
        } else {
            return new ParkingPermitGiveUpResponse("Your request for delete has been declined");
        }
    }
}
