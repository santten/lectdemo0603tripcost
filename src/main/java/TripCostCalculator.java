import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class TripCostCalculator {
    public static double fuelNeeded(double km){
        return km / 20;
    }

    public static double price(double liters, double pricePerLiter){
        return pricePerLiter * liters;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("TRIP COST CALCULATOR!");
        System.out.println("Distance to travel? (km)");
        double kilometers = s.nextDouble();
        System.out.println("Current fuel price? (€/liter)");
        double price = s.nextDouble();
        double fuelNeeded = fuelNeeded(kilometers);
        double priceTotal = price(fuelNeeded, price);
        System.out.println("Assuming fuel consumption of 5 l per 100 km,\n" +
                "You will need " + fuelNeeded + " liters of fuel. \n" +
                "Total price: " + priceTotal);

        System.out.println(kilometers);
        s.close();
    }
}
