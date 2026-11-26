
package vehicles;

public class Vehicle {

    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String chassisNo;
    private String model;

    public Vehicle(String model) {
        numVehicles++;

        chassisNo = "ch" + numVehicles;
        this.model = model;

        System.out.println("Vehicle manufactured");
    }

    // Nested Static Class Engine
    public static class Engine extends Vehicle {

        private int engineCapacity;

        public Engine(String model) {
            super(model);
            engineCapacity = 1600;
        }

        public int getEngineCapacity() {
            return engineCapacity;
        }
    }

    public static void setMake(String make) {
        MAKE = make;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "The vehicle is manufactured by: " + MAKE
                + "\nThe model type is " + model
                + "\nThe chassis number is " + chassisNo;
    }
}
