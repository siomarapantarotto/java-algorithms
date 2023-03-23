package parkinglot.allocatevancarandmoto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(1, 2, 3);

        parkingLot.printAvailability();

        /*
         * System.out.println(parkingLot.parkVehicle("van"));
         * System.out.println(parkingLot.parkVehicle("car"));
         * System.out.println(parkingLot.parkVehicle("moto"));
         * System.out.println(parkingLot.parkVehicle("bus"));
         */

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

        Boolean success;
        for (String vehicle : vehicleLine) {
            success = parkingLot.parkVehicle(vehicle);
            System.out.println(success
                    ? "Success parking: " + vehicle
                    : "Failed to park : " + vehicle);
        }

        parkingLot.printAvailability();
    }
}
