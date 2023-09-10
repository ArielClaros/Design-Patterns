import copy

class Car:
    def __init__(self, id, energyType, model, price, precedence):
        self.id = id
        self.energyType = energyType
        self.model = model
        self.price = price
        self.precedence = precedence

    def clone(self):
        return copy.deepcopy(self)

class Camion(Car):
    def __init__(self, id, model, price):
        super().__init__(id, "Diesel", model, price, "Camion")

class Bus(Car):
    def __init__(self, id, model, price):
        super().__init__(id, "Diesel", model, price, "Bus")

class Escarabajo(Car):
    def __init__(self, id, model, price):
        super().__init__(id, "Gasolina", model, price, "Escarabajo")

original_car = Camion(1, 2023, 50000.0)
cloned_car = original_car.clone()

print(f"Original: {original_car.model}, {original_car.precedence}, {original_car.price}")
print(f"Clonado: {cloned_car.model}, {cloned_car.precedence}, {cloned_car.price}")
