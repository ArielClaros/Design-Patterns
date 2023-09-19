package Adapter.Java.Draft;

import java.util.List;
import Java.Car.Car;
import Java.Location.Location;

public interface SubsidiaryAdapter {
    Location getLocation(Car car);
    List<Car> getCars();
}

