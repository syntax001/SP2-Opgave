abstract public class Car {
    // Variables
    String regNr;
    String make;
    String model;
    int modelYear;
    int numberOfDoors;

    // Constructor
    Car(String regNr, String make, String model, int modelYear, int numberOfDoors) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.numberOfDoors = numberOfDoors;
    }

    // Calculate taxes method
    public abstract double calculateGreenOwnersTax();

    // ------------------- GETTERS -------------------
    public String getRegNr() {
        return regNr;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    // ------------------- GETTERS -------------------


    // ------------------- SETTERS -------------------
    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    // ------------------- SETTERS -------------------
}
