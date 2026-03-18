package structural.proxy;

public class CityParkingLot implements ParkingLot{
    @Override
    public void enter(Car car) {
        System.out.println(car + " заїжджає на парковку.");
    }
}
