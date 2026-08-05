import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicles.containsKey(licensePlate)) {
            return false;
        }

        this.vehicles.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.vehicles.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicles.containsKey(licensePlate)) {
            this.vehicles.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehicles.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : this.vehicles.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
