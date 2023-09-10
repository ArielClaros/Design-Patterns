package Java.Car;

public class Car {
    private int id;
    private EnergyType energyType;
    private int model;
    private double price;
    private Precedence precendence;

    public Car(int id, EnergyType energyType, int model, double price, Precedence precedence){
        this.id = id;
        this.energyType = energyType;
        this.model = model;
        this.price = price;
        this.precendence = precedence;
    }

    public int getId() {
        return id;
    }

    public EnergyType getEnergyType() {
        return energyType;
    }

    public int getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Precedence getPrecendence() {
        return precendence;
    }
}
