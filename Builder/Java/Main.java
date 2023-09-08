package Java;

import Java.Car.Car;
import Java.Car.CarBuilderImpl;
import Java.Location.Location;
import Java.Location.LocationBuilderImple;
import Java.Stock.Stock;
import Java.Stock.StockBuilderImpl;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilderImpl()
            .setId(1)
            .setEnergyType("Electric")
            .setModel(2023)
            .build();

        Location location = new LocationBuilderImple()
            .setStatus("Sold out")
            .setDestination("Miami")
            .build();

        Stock stock = new StockBuilderImpl()
            .setQuantity(10)
            .build();
    }
}
