package parkingSlot;

import java.util.Objects;

public class Location {
    String section;
    int row;
    int placeNumber;

    public Location () {}

    public Location(String section, int row, int placeNumber) {
        this.section = section;
        this.row = row;
        this.placeNumber = placeNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Location location = (Location) object;
        return row == location.row && placeNumber == location.placeNumber && Objects.equals(section, location.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(section, row, placeNumber);
    }

    @Override
    public String toString() {
        return "Location{" +
                "section='" + section + '\'' +
                ", row=" + row +
                ", slotNumber=" + placeNumber +
                '}';
    }
}
