package structural.proxy;

public class ParkingBarrierProxy implements ParkingLot{
    private static final int MAX_CARS_ALLOWED = 3;

    private int currentCars;

    private final ParkingLot parkingLot;

    public ParkingBarrierProxy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void enter(Car car) {
        if (currentCars < MAX_CARS_ALLOWED) {
            parkingLot.enter(car);
            currentCars++;
        } else {
            System.out.println(car + " не може заїхати, немає вільних місць!");
        }
    }
}
