package Adapter.Java;

import Java.Car.Car;

public interface TaxHandler {
    double getTotalPrice(Car car);
    double getTaxValue();
}

