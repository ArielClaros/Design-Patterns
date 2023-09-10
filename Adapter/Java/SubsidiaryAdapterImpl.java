package Adapter.Java;

import java.util.ArrayList;
import java.util.List;
import Java.Car.Car;
import Java.Location.Location;

public class SubsidiaryAdapterImpl implements SubsidiaryAdapter {
    private Subsidiary subsidiary;

    public SubsidiaryAdapterImpl(Subsidiary subsidiary) {
        this.subsidiary = subsidiary;
    }

    @Override
    public Location getLocation(Car car) {
        int carId = car.getId();
        return subsidiary.getLocation(carId);
    }

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        return cars;
    }
}
