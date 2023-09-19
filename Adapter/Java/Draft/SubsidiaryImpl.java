package Adapter.Java.Draft;

import java.util.List;
import java.util.Map;
import Java.Car.Car;
import Java.Car.EnergyType;
import Java.Car.Precedence;
import Java.Location.Location;
import Java.Stock.Stock;

public class SubsidiaryImpl implements Subsidiary{
    private Map<Integer, Car> cars;
    private Map<Integer, Double> taxes;
    private ShipmentDepartament shipmentDepartament;
    private TaxHandler taxHandler;
    private String country;

    @Override
    public List<Stock> getAllStock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStock'");
    }
    @Override
    public List<Stock> getAllStockByType(EnergyType type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStockByType'");
    }
    @Override
    public List<Stock> getAllStockByPrecedence(Precedence type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStockByPrecedence'");
    }
    @Override
    public Double calculateTax(int cardId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateTax'");
    }
    @Override
    public Location getLocation(int cardId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLocation'");
    }
}
