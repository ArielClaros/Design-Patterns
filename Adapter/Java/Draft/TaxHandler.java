package Adapter.Java.Draft;

import Java.Car.Car;

public interface TaxHandler {
    double getTotalPrice(Car car);
    double getTaxValue();
}

