package Java.Car;

public class CarBuilderImpl implements CarBuilder{
    private int id;
    private String energyType;
    private int model;
    private double price;
    private String precendence;

    public CarBuilderImpl setId(int id){
        this.id = id;
        return this;
    }

    public CarBuilderImpl setEnergyType(String energyType){
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

    public CarBuilderImpl setPrecendence(String precedence){
        this.precendence = precedence;
        return this;
    }

    @Override
    public Car build() {
        return new Car(id, energyType, model, price, precendence);
    }
}
