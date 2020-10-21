import java.util.ArrayList;

public class Garage {
    // Our garage arraylist
    static ArrayList<Car> carpark = new ArrayList<Car>();

    // addCar method
    public static void addCar(Car car) {
        carpark.add(car);
    }

    // Calculate the sum of taxes
    public static double calculateGreenOwnersTaxTotal() {
        double sumOfTax = 0;

        for(Car car:carpark) {
            sumOfTax += car.calculateGreenOwnersTax();
        }
        return sumOfTax;
    }

    // toString override
    @Override
    public String toString() {
        for(int i = 0; i < carpark.size(); i++) {
            System.out.println("[CAR " + i + "]: " + carpark.get(i));
        }
        return "";
    }
}
