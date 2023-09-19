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
    constructor(id, energyType, model, price, precedence){
        super(id, energyType, model, price, precedence);
    }
}

class Bus extends Car {
    constructor(id, energyType, model, price, precedence){
        super(id, energyType, model, price, precedence);
    }
}

class Escarabajo extends Car {
    constructor(id, energyType, model, price, precedence){
        super(id, energyType, model, price, precedence);
    }
}
