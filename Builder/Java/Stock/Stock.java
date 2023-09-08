package Java.Stock;

import Java.Car.Car;

public class Stock {
    private Car car;
    private int quantity;
    
    public Stock(Car car, int quantity){
        this.car = car;
        this.quantity = quantity;
    }
}
