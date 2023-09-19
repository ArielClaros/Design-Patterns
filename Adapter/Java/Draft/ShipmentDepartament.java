package Adapter.Java.Draft;

import java.util.List;
import Java.Car.Car;
import Java.Location.Location;

public interface ShipmentDepartament {
    Location getLocation(Car car);
    List<Car> getCars();
}
