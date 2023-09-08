package Java.Car;

public class Car {
    private int id;
    private String energyType;
    private int model;
    private double price;
    private String precendence;

    public Car(int id, String energyType, int model, double price, String precedence){
        this.id = id;
        this.energyType = energyType;
        this.model = model;
        this.price = price;
        this.precendence = precedence;
    }
}
