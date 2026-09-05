package Course.Lists.L2.Exs.ParkingLot.Services;

import Course.Lists.L2.Exs.ParkingLot.Classes.Client;
import Course.Lists.L2.Exs.ParkingLot.Classes.Date;
import Course.Lists.L2.Exs.ParkingLot.Classes.Vehicle;

import java.util.ArrayList;

public class BillingService {

    private final float hourlyRate;

    public BillingService(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * The cost is calculated based on the difference between entry and exit times in hour multiplied by the hourly rate.
     * If the vehicle is still parked, the current time is used as the exit time.
     * @param v vehicle
     * @return cost
     */
    float calculateCost(Vehicle v) {
        Date entry = v.getEntry();
        Date exit = v.getExit() != null ? v.getExit() : new Date(true);

        int diffSeconds = entry.difference(exit);

        if (v.getClient() != null) {
            diffSeconds = (int) (diffSeconds * 0.9);
        }

        return ((float) diffSeconds / 3600) * hourlyRate;
    }

    public void processPayment(Vehicle v) {
        float cost = calculateCost(v);
        v.setCost(cost);
        v.pay();
        System.out.println("Payment processed for vehicle " + v.getPlate() + ": R$" + cost);
    }

    public float totalMonthRevenue(ArrayList<Vehicle> vehicles, int month) {
        float totalRevenue = 0;
        for(Vehicle v : vehicles){
            if(!v.isParked() && v.getExit() != null && v.getExit().getMonth() == month){
                totalRevenue += v.getCost();
            }
        }
        return totalRevenue;
    }
}
