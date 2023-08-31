class Bank:
    _instance = None
    balance = 0
    
    def _init_(self):
        if Bank._instance is not None:
            raise Exception("This class is a Singleton. Use get_instance() to access the instance.")
    
    @classmethod
    def get_instance(cls):
        if cls._instance is None:
            cls._instance = cls()
        return cls._instance
    
    def deposit(self, amount):
        self.balance += amount
        print(f"Deposited {amount} units. New balance: {self.balance}")
    
    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"Withdrew {amount} units. New balance: {self.balance}")
        else:
            print("Insufficient balance!")
    
    def check_balance(self):
        print(f"Current balance: {self.balance}")

# Uso del Singleton Bank
bank1 = Bank.get_instance()
bank2 = Bank.get_instance()

# bank1 y bank2 son la misma instancia
print(bank1 is bank2)  # True

# Realizamos algunas operaciones
bank1.deposit(1000)
bank2.withdraw(200)
bank1.check_balance()