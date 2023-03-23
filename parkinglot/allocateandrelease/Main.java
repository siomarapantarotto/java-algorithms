package parkinglot.allocateandrelease;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

                // Create parking lot
                ParkingLot parkingLot = new ParkingLot(3);

                System.out.println("\nNew parking lot created");
                System.out.println("Total capacity : " + parkingLot.getTotalCapacity());
                System.out.println("Available spots: " + parkingLot.getAvailableCapacity());

                // Create some vehicles
                Vehicle vehicle1 = new Vehicle("AAA-111");
                Vehicle vehicle2 = new Vehicle("BBB-222");
                Vehicle vehicle3 = new Vehicle("CCC-333");
                Vehicle vehicle4 = new Vehicle("DDD-444");
                Vehicle vehicle5 = new Vehicle("EEE-555");

                // Add vehicles to the parking lot input line built with an Array List
                ArrayList<Vehicle> vehicleLine = new ArrayList<>();
                vehicleLine.add(vehicle1);
                vehicleLine.add(vehicle2);
                vehicleLine.add(vehicle3);
                vehicleLine.add(vehicle4);
                vehicleLine.add(vehicle5);

                // Declare boolean for parking space allocation/release success
                Boolean success;

                // Try allocating parking space for vehicles in line
                for (Vehicle vehicle : vehicleLine) {
                        success = parkingLot.allocateParkingSpace(vehicle);
                        System.out.println(success
                                        ? "\nParking vehicle " + vehicle.getLicensePlate() + ": Success "
                                        : "\nParking vehicle " + vehicle.getLicensePlate() + ": Failed");
                }

                // Release parking space for parked vehicle
                success = parkingLot.releaseParkingSpace(vehicle1);
                System.out.println(success
                                ? "\nReleasing vehicle " + vehicle1.getLicensePlate() + ": Success "
                                : "\nReleasing vehicle " + vehicle1.getLicensePlate() + ": Failed (non-existent)");

                // Release parking space for a non-existent vehicle
                Vehicle vehicle6 = new Vehicle("FFF-666");
                success = parkingLot.releaseParkingSpace(vehicle6);
                System.out.println(success
                                ? "\nReleasing vehicle " + vehicle6.getLicensePlate() + ": Success "
                                : "\nReleasing vehicle " + vehicle6.getLicensePlate() + ": Failed (non-existent)");

                // Try allocating parking space after a release
                Vehicle vehicle7 = new Vehicle("GGG-777");
                success = parkingLot.allocateParkingSpace(vehicle7);
                System.out.println(success
                                ? "\nParking vehicle " + vehicle7.getLicensePlate() + ": Success "
                                : "\nParking vehicle " + vehicle7.getLicensePlate() + ": Failed");

                System.out.println("\nParking lot status");
                System.out.println("Total capacity : " + parkingLot.getTotalCapacity());
                System.out.println("Available spots: " + parkingLot.getAvailableCapacity());
                parkingLot.printParkedVehicles();

        }
}
