package vehicleShowroom;

public class SportsVehicle extends Vehicle {

    private String turbo;

    public SportsVehicle(String modelNumber, String engineType, int enginePower, int tireSize, String turbo) {
        super(modelNumber, enginePower, tireSize);
        engineType = "A";
        this.engineType = getEngineType(engineType);
        this.turbo = turbo;
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Turbo : " + turbo);
    }
}
