public class GasCar extends Car {
    // Variables unique to GasCar
    int octaneNumber;
    int kmPerLiter;

    // Constructor
    GasCar(int octaneNumber, int kmPerLiter, String regNr, String make, String model, int modelYear, int numberOfDoors) {
        super(regNr, make, model, modelYear, numberOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPerLiter = kmPerLiter;
    }

    // Calculate tax
    public double calculateGreenOwnersTax() {
        double tax = 0;
        if(kmPerLiter < 5) {
            tax = 10470;
        } else if(kmPerLiter >= 5 && kmPerLiter <= 10) {
            tax = 5500;
        } else if(kmPerLiter > 10 && kmPerLiter <= 15) {
            tax = 2340;
        } else if(kmPerLiter > 15 && kmPerLiter <= 20) {
            tax = 1050;
        } else if(kmPerLiter > 20) {
            tax = 330;
        }
        return tax;
    }

    // ------------------- GETTERS -------------------
    public int getOctaneNumber() {
        return octaneNumber;
    }

    public int getKmPerLiter() {
        return kmPerLiter;
    }
    // ------------------- GETTERS -------------------


    // ------------------- SETTERS -------------------
    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public void setKmPerLiter(int kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }
    // ------------------- SETTERS -------------------


    // toString override
    @Override
    public String toString() {
        return "GasCar{" +
                "octaneNumber=" + octaneNumber +
                ", kmPerLiter=" + kmPerLiter +
                ", regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
