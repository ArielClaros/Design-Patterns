class Car {
    constructor(id, energyType, model, price, precedence){
        this.id = id;
        this.energyType = energyType;
        this.model = model;
        this.price = price;
        this.precedence = precedence;
    }

    clone() {
        return Object.assign(Object.create(Object.getPrototypeOf(this)), this);
    }
}

class Camion extends Car {
    constructor(id, model, price){
        super(id, "Diesel", model, price, "Camion");
    }
}

class Bus extends Car {
    constructor(id, model, price){
        super(id, "Diesel", model, price, "Bus");
    }
}

class Escarabajo extends Car {
    constructor(id, model, price){
        super(id, "Gasolina", model, price, "Escarabajo");
    }
}
