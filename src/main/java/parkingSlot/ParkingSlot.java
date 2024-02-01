package parkingSlot;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ParkingSlot extends Location {
    private static int counter = 1;
    private Location location;

    private int slotId;
    @JsonProperty("isFree")
    private boolean isFree;


    public ParkingSlot() {
        this.slotId = counter++;
    }

    public ParkingSlot(boolean isFree) {
        this.slotId = counter++;
        this.isFree = isFree;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParkingSlot that = (ParkingSlot) object;
        return slotId == that.slotId && isFree == that.isFree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotId, isFree);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return
                "{slotId=" + slotId +
                        ", location: {" +
                        "section='" + section + '\'' +
                        ", row=" + row +
                        ", placeNumber=" + placeNumber +
                        "}}";
    }
}
