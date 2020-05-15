package vehicleShowroom;

public abstract class Vehicle implements Ivehicle {

    protected String modelNumber;
    protected String engineType;
    protected int enginePower;
    protected int tireSize;

    public enum EngineType {
        A, B, C;
    }

    public Vehicle(String modelNumber, int enginePower, int tireSize) {
        this.modelNumber = modelNumber;
        //this.engineType = getEngineType(engineType);
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    @Override
    public void getVehicleDetails() {
        System.out.println("Model Number : " + modelNumber);
        System.out.println("Engine Type : " + engineType);
        System.out.println("Engine Power : " + enginePower + " HP");
        System.out.println("Tire Size : " + tireSize);

    }

    protected String getEngineType(String engineType) {

        String getValue = "";
        switch (EngineType.valueOf(engineType)) {
            case A:
                getValue = "Oil";
                break;

            case B:
                getValue = "Gas";
                break;

            case C:
                getValue = "Diesel";
                break;
            default:

        }
        return getValue;
    }

}
