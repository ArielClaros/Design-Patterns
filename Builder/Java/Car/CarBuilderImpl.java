package Java.Car;

public class CarBuilderImpl implements CarBuilder{
    private int id;
    private EnergyType energyType;
    private int model;
    private double price;
    private Precedence precendence;

    public CarBuilderImpl setId(int id){
        this.id = id;
        return this;
    }

    public CarBuilderImpl setEnergyType(EnergyType energyType){
        this.energyType = energyType;
        return this;
    }

    public CarBuilderImpl setModel(int model){
        this.model = model;
        return this;
    }

    public CarBuilderImpl setPrice(double price){
        this.price = price;
        return this;
    }

    public CarBuilderImpl setPrecendence(Precedence precedence){
        this.precendence = precedence;
        return this;
    }

    @Override
    public Car build() {
        return new Car(id, energyType, model, price, precendence);
    }
}
