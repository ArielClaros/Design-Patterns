package Java.Stock;

import Java.Car.Car;

public class StockBuilderImpl implements StockBuilder{
    private Car car;
    private int quantity;

    public StockBuilderImpl setCar(Car car){
        this.car = car;
        return this;
    }

    public StockBuilderImpl setQuantity(int quantity){
        this.quantity = quantity;
        return this;
    }

    @Override
    public Stock build() {
        return new Stock(car, quantity);
    }
}
