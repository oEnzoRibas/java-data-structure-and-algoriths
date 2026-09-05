package Course.Lists.L2.Exs.ParkingLot;

import Course.Lists.L2.Exs.ParkingLot.Classes.ParkingLot;
import Course.Lists.L2.Exs.ParkingLot.Classes.ParkingLotUI;

public class Main {
    private static final float HOURLY_RATE = 1.0f;

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(HOURLY_RATE);
        ParkingLotUI ui = new ParkingLotUI(lot);
        ui.populatingData();
        ui.start();
    }
}