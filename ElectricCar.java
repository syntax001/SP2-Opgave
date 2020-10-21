public class ElectricCar extends Car {
    // Variables unique to ElectricCar
    int batteryCapacityKWh;
    int maxKm;
    double whPerKm;

    // Constructor
    ElectricCar(int batteryCapacityKWh, int maxKm, double whPerKm, String regNr, String make, String model, int modelYear, int numberOfDoors) {
        super(regNr, make, model, modelYear, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPerKm = whPerKm;
    }

    // Tax calculation
    public double calculateGreenOwnersTax() {
        double tax = 0;
        whPerKm = whPerKm / 91.25;
        whPerKm = 100 / whPerKm;
        if(whPerKm < 5) {
            tax = 10470;
        } else if(whPerKm >= 5 && whPerKm <= 10) {
            tax = 5500;
        } else if(whPerKm > 10 && whPerKm <= 15) {
            tax = 2340;
        } else if(whPerKm > 15 && whPerKm <= 20) {
            tax = 1050;
        } else if(whPerKm > 20) {
            tax = 330;
        }
        return tax;
    }


    // ------------------- GETTERS -------------------
    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public double getWhPerKm() {
        return whPerKm;
    }
    // ------------------- GETTERS -------------------


    // ------------------- SETTERS -------------------
    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPerKm(double whPerKm) {
        this.whPerKm = whPerKm;
    }
    // ------------------- SETTERS -------------------


    // toString override
    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPerKm=" + whPerKm +
                ", regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
