package vehicleShowroom;

public class NormalVehicle extends Vehicle {

    public NormalVehicle(String modelNumber, String engineType, int enginePower, int tireSize) {

        super(modelNumber, enginePower, tireSize);
        this.engineType = getEngineType(engineType);
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();

    }
}
