package Java;

import Java.Car.Car;
import Java.Car.CarBuilderImpl;
import Java.Car.EnergyType;
import Java.Location.Location;
import Java.Location.LocationBuilderImple;
import Java.Location.Status;
import Java.Stock.Stock;
import Java.Stock.StockBuilderImpl;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilderImpl()
            .setId(1)
            .setEnergyType(EnergyType.ELECTRIC)
            .setModel(2023)
            .build();

        Location location = new LocationBuilderImple()
            .setStatus(Status.SENT)
            .setDestination("Miami")
            .build();

        Stock stock = new StockBuilderImpl()
            .setQuantity(10)
            .build();
    }
}
