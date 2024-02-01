package user;

import parkingSlot.ParkingSlot;

import java.util.Objects;

public class User {
    private static int counter = 1;
    private String firstName;
    private String lastName;
    private int id;
    private ParkingSlot parkingSlot;

    public User() {
        this.id = counter++;
    }

    public User(String firstName, String lastName, ParkingSlot parkingSlot) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = counter++;
        this.parkingSlot = parkingSlot;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
}
