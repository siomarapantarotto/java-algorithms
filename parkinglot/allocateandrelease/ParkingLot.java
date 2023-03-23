package parkinglot.allocateandrelease;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private int totalCapacity;
    private int availableCapacity;
    private Map<String, Vehicle> parkingSpaces;

    public ParkingLot(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availableCapacity = totalCapacity;
        this.parkingSpaces = new HashMap<>();
    }

    public boolean allocateParkingSpace(Vehicle vehicle) {
        if (this.availableCapacity > 0) {
            this.parkingSpaces.put(vehicle.getLicensePlate(), vehicle);
            this.availableCapacity--;
            return true;
        } else {
            return false;
        }
    }

    public boolean releaseParkingSpace(Vehicle vehicle) {
        if (this.parkingSpaces.containsKey(vehicle.getLicensePlate())) {
            this.parkingSpaces.remove(vehicle.getLicensePlate());
            this.availableCapacity++;
            return true;
        } else {
            return false;
        }
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public Map<String, Vehicle> getParkingSpaces() {
        return parkingSpaces;
    }

    public void print() {
        // print the contents of the HashMap
        for (String key : parkingSpaces.keySet()) {
            System.out.println(key + ": " + Arrays.asList(parkingSpaces.get(key)));
        }
    }

}
