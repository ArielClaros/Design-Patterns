package Java.Stock;

import Java.Car.Car;

public class Stock {
    private final Car car;
    private final int quantity;
    
    public Stock(Car car, int quantity){
        this.car = car;
        this.quantity = quantity;
    }

    public Car getCar() {
        return car;
    }

    public int getQuantity() {
        return quantity;
    }

    public static StockBuilder getBuilder(){
        return new StockBuilder();
    }

    public static class StockBuilder{
        private Car car;
        private int quantity;

        public StockBuilder car(Car car){
            this.car = car;
            return this;
        }

        public StockBuilder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public Stock build(){
            return new Stock(this.car, this.quantity);
        }
    }

    public static class Main{
        public static void main(String[] args) {
            Car car = Car.getBuilder().build();
            Stock stock = Stock.getBuilder()
                    .car(car)
                    .quantity(20)
                    .build();

            System.out.println(stock.getQuantity());
        }
    }
}
