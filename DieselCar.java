public class DieselCar extends Car {
    // Variables unique to DieselCar
    boolean hasFilter = false;
    int kmPerLiter;

    // Constructor
    DieselCar(boolean hasFilter, int kmPerLiter, String regNr, String make, String model, int modelYear, int numberOfDoors) {
        super(regNr, make, model, modelYear, numberOfDoors);
        this.hasFilter = hasFilter;
        this.kmPerLiter = kmPerLiter;
    }

    // Tax calculation
    public double calculateGreenOwnersTax() {
        double tax = 0;
        if(kmPerLiter < 5) {
            tax = 10470 + 15260;
        } else if(kmPerLiter >= 5 && kmPerLiter <= 10) {
            tax = 5500 + 2770;
        } else if(kmPerLiter > 10 && kmPerLiter <= 15) {
            tax = 2340 + 1850;
        } else if(kmPerLiter > 15 && kmPerLiter <= 20) {
            tax = 1050 + 1390;
        } else if(kmPerLiter > 20) {
            tax = 330 + 130;
        }
        if(hasFilter == false) {
            tax = tax + 1000;
        }
        return tax;
    }

    // ------------------- GETTERS -------------------
    public boolean isHasFilter() {
        return hasFilter;
    }

    public int getKmPerLiter() {
        return kmPerLiter;
    }
    // ------------------- GETTERS -------------------


    // ------------------- SETTERS -------------------
    public void setHasFilter(boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public void setKmPerLiter(int kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }
    // ------------------- SETTERS -------------------


    // toString override
    @Override
    public String toString() {
        return "DieselCar{" +
                "hasFilter=" + hasFilter +
                ", kmPerLiter=" + kmPerLiter +
                ", regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
