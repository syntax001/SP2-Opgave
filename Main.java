public class Main {
    public static void main (String[] args) {
        // Instantiate our garage
        Garage garage = new Garage();

        // Add car entries
        Car teslaModelX = new ElectricCar(100,548,2.8,"JB 56 3423","Tesla","Model X",2020,4);
        Car audiR8 = new GasCar(100,18,"CP 67 439","Audi","R8",2020,2);
        Car mercedesA200 = new DieselCar(true,22,"RZ 56 234","Mercedes","A200",2020,4);

        // Add our cars to our garage
        Garage.addCar(teslaModelX);
        Garage.addCar(audiR8);
        Garage.addCar(mercedesA200);

        // Print the contents of garage and our sum of taxes method
        System.out.println(garage);
        System.out.println("Sum of taxes: " + Garage.calculateGreenOwnersTaxTotal());
    }
}
