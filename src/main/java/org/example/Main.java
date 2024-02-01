package org.example;

import parking_service.ParkingServiceImpl;
import user.User;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
//        Section section1 = new Section();
//        Section section2 = new Section();
//        Section section3 = new Section();
//
//        ParkingSlot parkingSlot11 = new ParkingSlot("1", 1, 1, true);
//        ParkingSlot parkingSlot12 = new ParkingSlot("1", 2, 1, false);
//        ParkingSlot parkingSlot13 = new ParkingSlot("1", 3, 1, true);
//        ParkingSlot parkingSlot14 = new ParkingSlot("1", 4, 1, false);
//        ParkingSlot parkingSlot15 = new ParkingSlot("1", 5, 1, true);
//
//        ParkingSlot parkingSlot21 = new ParkingSlot("2", 1, 1, true);
//        ParkingSlot parkingSlot22 = new ParkingSlot("2", 2, 1, false);
//        ParkingSlot parkingSlot23 = new ParkingSlot("2", 3, 1, false);
//        ParkingSlot parkingSlot24 = new ParkingSlot("2", 4, 1, true);
//        ParkingSlot parkingSlot25 = new ParkingSlot("2", 5, 1, false);
//
//        ParkingSlot parkingSlot31 = new ParkingSlot("3", 1, 1, false);
//        ParkingSlot parkingSlot32 = new ParkingSlot("3", 2, 1, true);
//        ParkingSlot parkingSlot33 = new ParkingSlot("3", 3, 1, false);
//        ParkingSlot parkingSlot34 = new ParkingSlot("3", 4, 1, true);
//        ParkingSlot parkingSlot35 = new ParkingSlot("3", 5, 1, true);
//
//        section1.addParkingSlot(parkingSlot11);
//        section1.addParkingSlot(parkingSlot12);
//        section1.addParkingSlot(parkingSlot13);
//        section1.addParkingSlot(parkingSlot14);
//        section1.addParkingSlot(parkingSlot15);
//
//        section2.addParkingSlot(parkingSlot21);
//        section2.addParkingSlot(parkingSlot22);
//        section2.addParkingSlot(parkingSlot23);
//        section2.addParkingSlot(parkingSlot24);
//        section2.addParkingSlot(parkingSlot25);
//
//        section3.addParkingSlot(parkingSlot31);
//        section3.addParkingSlot(parkingSlot32);
//        section3.addParkingSlot(parkingSlot33);
//        section3.addParkingSlot(parkingSlot34);
//        section3.addParkingSlot(parkingSlot35);
//
//        Parking parking = new Parking();
//
//        parking.addParkingSection(section1);
//        parking.addParkingSection(section2);
//        parking.addParkingSection(section3);
//
//        Gson gson = new Gson();


//        System.out.println(togson);
//        JsonWriter jsonWriter = new JsonWriter(new FileWriter("src/main/resources/parking_slots.json"));
//        jsonWriter.

        //System.out.println(parking);

//        JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/parking_slots.json"));
//        Parking parking2 = gson.fromJson(jsonReader, Parking.class);
//        System.out.println(parking2);

        ParkingServiceImpl parkingServiceImpl = new ParkingServiceImpl();
        System.out.println(parkingServiceImpl.getAvailableParkingSlot());

//        ParkingSlot parkingSlot1 = new ParkingSlot(1, true);
//        ParkingSlot parkingSlot2 = new ParkingSlot(2, true);
//        ParkingSlot parkingSlot3 = new ParkingSlot(3, true);
//        ParkingSlot parkingSlot4 = new ParkingSlot(4, true);
//        ParkingSlot parkingSlot5 = new ParkingSlot(5, true);
//        ParkingSlot parkingSlot6 = new ParkingSlot(6, true);
//        ParkingSlot parkingSlot7 = new ParkingSlot(7, true);
//        ParkingSlot parkingSlot8 = new ParkingSlot(8, true);
//        ParkingSlot parkingSlot9 = new ParkingSlot(9, true);
//        ParkingSlot parkingSlot10 = new ParkingSlot(10, true);
//        ParkingSlot parkingSlot11 = new ParkingSlot(11, true);
//        ParkingSlot parkingSlot12 = new ParkingSlot(12, true);
//        ParkingSlot parkingSlot13 = new ParkingSlot(13, true);
//        ParkingSlot parkingSlot14 = new ParkingSlot(14, true);
//        ParkingSlot parkingSlot15 = new ParkingSlot(15, true);
//
//        parkingSlot1.setRow(1);
//        parkingSlot1.setSection("a");
//        parkingSlot1.setPlaceNumber(1);
//
//        parkingSlot2.setRow(1);
//        parkingSlot2.setSection("a");
//        parkingSlot2.setPlaceNumber(2);
//
//        parkingSlot3.setRow(1);
//        parkingSlot3.setSection("a");
//        parkingSlot3.setPlaceNumber(3);
//
//        parkingSlot4.setRow(1);
//        parkingSlot4.setSection("a");
//        parkingSlot4.setPlaceNumber(4);
//
//        parkingSlot5.setRow(1);
//        parkingSlot5.setSection("a");
//        parkingSlot5.setPlaceNumber(5);
//
//        parkingSlot6.setRow(1);
//        parkingSlot6.setSection("a");
//        parkingSlot6.setPlaceNumber(6);
//
//        parkingSlot7.setRow(1);
//        parkingSlot7.setSection("a");
//        parkingSlot7.setPlaceNumber(7);
//
//        parkingSlot8.setRow(1);
//        parkingSlot8.setSection("a");
//        parkingSlot8.setPlaceNumber(8);
//
//        parkingSlot9.setRow(1);
//        parkingSlot9.setSection("b");
//        parkingSlot9.setPlaceNumber(1);
//
//        parkingSlot10.setRow(1);
//        parkingSlot10.setSection("b");
//        parkingSlot10.setPlaceNumber(2);
//
//        parkingSlot11.setRow(1);
//        parkingSlot11.setSection("b");
//        parkingSlot11.setPlaceNumber(3);
//
//        parkingSlot12.setRow(1);
//        parkingSlot12.setSection("b");
//        parkingSlot12.setPlaceNumber(4);
//
//        parkingSlot13.setRow(1);
//        parkingSlot13.setSection("b");
//        parkingSlot13.setPlaceNumber(5);
//
//        parkingSlot14.setRow(1);
//        parkingSlot14.setSection("b");
//        parkingSlot14.setPlaceNumber(6);
//
//        parkingSlot15.setRow(1);
//        parkingSlot15.setSection("b");
//        parkingSlot15.setPlaceNumber(7);
//
//        List<ParkingSlot> parkingSlotList = new ArrayList<>();
//
//        parkingSlotList.add(parkingSlot1);
//        parkingSlotList.add(parkingSlot2);
//        parkingSlotList.add(parkingSlot3);
//        parkingSlotList.add(parkingSlot4);
//        parkingSlotList.add(parkingSlot5);
//        parkingSlotList.add(parkingSlot6);
//        parkingSlotList.add(parkingSlot7);
//        parkingSlotList.add(parkingSlot8);
//        parkingSlotList.add(parkingSlot9);
//        parkingSlotList.add(parkingSlot10);
//        parkingSlotList.add(parkingSlot11);
//        parkingSlotList.add(parkingSlot12);
//        parkingSlotList.add(parkingSlot13);
//        parkingSlotList.add(parkingSlot14);
//        parkingSlotList.add(parkingSlot15);
//
//        String togson = gson.toJson(parkingSlotList);
//        System.out.println(togson);
//        System.out.println();
//        System.out.println(parkingSlotList);
    }
}