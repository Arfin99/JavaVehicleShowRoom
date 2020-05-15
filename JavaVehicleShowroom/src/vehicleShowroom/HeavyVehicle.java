package vehicleShowroom;

public class HeavyVehicle extends Vehicle {

    private double weight;

    public HeavyVehicle(String modelNumber, String engineType, int enginePower, int tireSize, double weight) {
        super(modelNumber, enginePower, tireSize);
        engineType = "C";
        this.engineType = getEngineType(engineType);
        this.weight = weight;
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Weight : " + weight + " kg");
    }

}
