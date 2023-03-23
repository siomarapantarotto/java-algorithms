package parkinglot.allocatevancarandmoto;

public class ParkingLot {
    private int vanSpaces;
    private int carSpaces;
    private int motoSpaces;

    public ParkingLot(int vanSpaces, int carSpaces, int motorcycleSpaces) {
        this.vanSpaces = vanSpaces;
        this.carSpaces = carSpaces;
        this.motoSpaces = motorcycleSpaces;
    }

    public boolean parkVehicle(String vehicleType) {

        switch (vehicleType) {
            case "van":
                if (vanSpaces > 0) {
                    vanSpaces--;
                    return true;
                }
                break;
            case "car":
                if (carSpaces > 0) {
                    carSpaces--;
                    return true;
                }
                break;
            case "moto":
                if (motoSpaces > 0) {
                    motoSpaces--;
                    return true;
                }
                break;
            default:
                System.out.println("ATTENTION!!! Invalid vehicle trying to park.");
        }
        return false;
    }

    public void printAvailability() {
        System.out.println("\nParking lot availability:");
        System.out.println("Van spaces : " + vanSpaces);
        System.out.println("Car spaces : " + carSpaces);
        System.out.println("Moto spaces: " + motoSpaces);
        System.out.println();
    }
}
