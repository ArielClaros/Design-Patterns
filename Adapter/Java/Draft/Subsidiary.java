package Adapter.Java.Draft;

import java.util.List;
import Java.Car.EnergyType;
import Java.Car.Precedence;
import Java.Location.Location;
import Java.Stock.Stock;

public interface Subsidiary {
    List<Stock> getAllStock();
    List<Stock> getAllStockByType(EnergyType type);
    List<Stock> getAllStockByPrecedence(Precedence type);
    Double calculateTax(int cardId);
    Location getLocation(int cardId);
}
