package parkinglot.viamapimplementation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotViaMap {
    private Map<String, Integer> capacity;
    private Map<String, Integer> occupied;

    public ParkingLotViaMap(int carCapacity, int motoCapacity, int vanCapacity) {
        this.capacity = new HashMap<String, Integer>();
        this.capacity.put("car", carCapacity);
        this.capacity.put("moto", motoCapacity);
        this.capacity.put("van", vanCapacity);

        this.occupied = new HashMap<String, Integer>();
        this.occupied.put("car", 0);
        this.occupied.put("moto", 0);
        this.occupied.put("van", 0);
    }

    public boolean park(String vehicleType) {
        if (!this.capacity.containsKey(vehicleType)) {
            return false;
        }

        if (this.occupied.get(vehicleType) == this.capacity.get(vehicleType)) {
            return false;
        }

        this.occupied.put(vehicleType, this.occupied.get(vehicleType) + 1);
        return true;
    }

    public boolean unpark(String vehicleType) {
        if (!this.capacity.containsKey(vehicleType)) {
            return false;
        }

        if (this.occupied.get(vehicleType) == 0) {
            return false;
        }

        this.occupied.put(vehicleType, this.occupied.get(vehicleType) - 1);
        return true;
    }

    public int getCapacity(String vehicleType) {
        if (!this.capacity.containsKey(vehicleType)) {
            return -1;
        }

        return this.capacity.get(vehicleType);
    }

    public int getOccupied(String vehicleType) {
        if (!this.occupied.containsKey(vehicleType)) {
            return -1;
        }

        return this.occupied.get(vehicleType);
    }
}