package Java.Car;

import java.util.Locale;

public class Car { //los atributos de la clase tienen que ser final, los del builder no
    private final int id;
    private final EnergyType energyType;
    private final int model;
    private final double price;
    private final Precedence precedence;

    public Car(int id, EnergyType energyType, int model, double price, Precedence precedence){
        this.id = id;
        this.energyType = energyType;
        this.model = model;
        this.price = price;
        this.precedence = precedence;
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

    public Precedence getPrecedence() {
        return precedence;
    }

    public static CarBuilder getBuilder(){
        return new CarBuilder();
    }

    public static class CarBuilder{
        private int id;
        private EnergyType energyType;
        private int model;
        private double price;
        private Precedence precedence;

        public CarBuilder id(int id){
            this.id = id;
            return this;
        }

        public CarBuilder energyType(EnergyType energyType){
            this.energyType = energyType;
            return this;
        }

        public CarBuilder model(int model){
            this.model = model;
            return this;
        }

        public CarBuilder price(double price){
            this.price = price;
            return this;
        }

        public CarBuilder precedence(Precedence precedence){
            this.precedence = precedence;
            return this;
        }

        public Car build(){
            return new Car(this.id, this.energyType, this.model, this.price, this.precedence);
        }
    }

    public static class Main{
        public static void main(String[] args) {
            Car car = Car.getBuilder()
                .id(1)
                .energyType(EnergyType.ELECTRIC)
                .model(2022)
                .price(2000)
                .precedence(Precedence.AMERICAN)
                .build();

            System.out.println(car.getId());
        }
    }
}
