package Prototype.Java;

import java.util.Objects;

public abstract class Car {
    public int id;
    public int model;
    public Double price;

    public Car() {
    }

    public Car(Car car) {
        if (car != null) {
            this.id = car.id;
            this.model = car.model;
            this.price = car.price;
        }
    }

    public abstract Car clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Car)) return false;
        Car car2 = (Car) object2;
        return car2.id == id && car2.model == model && Objects.equals(car2.price, price);
    }
}

class Camion extends Car {
    public int weight;

    public Camion(){

    }

    public Camion(Camion target) {
        super(target);
        if (target != null) {
            this.weight = target.weight;
        }
    }

    @Override
    public Car clone() {
        return new Camion(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Camion) || !super.equals(object2)) return false;
        Camion camion = (Camion) object2;
        return camion.weight == weight;
    }
}

class Bus extends Car {
    public int width;
    public int height;

    public Bus(){

    }

    public Bus(Bus target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Car clone() {
        return new Bus(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Bus) || !super.equals(object2)) return false;
        Bus bus = (Bus) object2;
        return bus.width == width && bus.height == height;
    }

    public static class Main{
        public static void main(String[] args) {
            Camion camion = new Camion();
            camion.id = 10;
            camion.model = 2022;
            camion.weight = 15;
            camion.price = 2000.0;

            Car camion2 = camion.clone();

            Bus bus = new Bus();
            bus.width = 10;
            bus.height = 20;
            bus.price = 2000.0;

            System.out.println(camion.toString());
            System.out.println(camion2.toString());
        }
    }
}
