package parkinglot.allocatevancarandmoto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create parking lot with capacity for each vehicle
        ParkingLot parkingLot = new ParkingLot(1, 2, 3);

        parkingLot.printAvailability();

        // Try also shuffling the order
        ArrayList<String> vehicleLine = new ArrayList<>();
        vehicleLine.add("van");
        vehicleLine.add("van");
        vehicleLine.add("trailler");
        vehicleLine.add("car");
        vehicleLine.add("car");
        vehicleLine.add("car");
        vehicleLine.add("trailler");
        vehicleLine.add("moto");
        vehicleLine.add("moto");
        vehicleLine.add("moto");
        vehicleLine.add("moto");
        vehicleLine.add("trailler");

        // Loop all the vehicles that intend to park
        Boolean success;
        for (String vehicle : vehicleLine) {
            success = parkingLot.parkVehicle(vehicle);
            System.out.println(success
                    ? "Success parking: " + vehicle
                    : "Failed to park : " + vehicle);
        }

        parkingLot.printAvailability();

        // The code below shows that the ParkingLot class works,
        // but without further details. Prefer the above one.
        //
        // system.out.println(parkinglot.parkvehicle("van"));
        // system.out.println(parkinglot.parkvehicle("car"));
        // system.out.println(parkinglot.parkvehicle("moto"));
        // system.out.println(parkinglot.parkvehicle("bus"));

    }
}
