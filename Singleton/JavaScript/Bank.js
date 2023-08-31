class Bank {
    constructor() {
      this.customers = [];
      this.accounts = [];
    }
  
    addCustomer(customer) {
      this.customers.push(customer);
    }
  
    createAccount(customer, initialBalance) {
      const account = new BankAccount(customer, initialBalance);
      this.accounts.push(account);
      return account;
    }
  
    // Otros métodos relacionados con la gestión bancaria
  }
  
  class BankAccount {
    constructor(customer, initialBalance) {
      this.customer = customer;
      this.balance = initialBalance;
    }
  
    // Métodos para gestionar transacciones, consultar saldo, etc.
  }
  
  // Implementación del Singleton
  class BankSingleton {
    constructor() {
      if (!BankSingleton.instance) {
        BankSingleton.instance = new Bank();
      }
    }
  
    getInstance() {
      return BankSingleton.instance;
    }
  }
  
  // Uso del Singleton
  const bankInstance1 = new BankSingleton().getInstance();
  const bankInstance2 = new BankSingleton().getInstance();
  
  const customer1 = "John Doe";
  const initialBalance1 = 1000;
  bankInstance1.addCustomer(customer1);
  const account1 = bankInstance1.createAccount(customer1, initialBalance1);
  
  const customer2 = "Jane Smith";
  const initialBalance2 = 1500;
  bankInstance2.addCustomer(customer2);
  const account2 = bankInstance2.createAccount(customer2, initialBalance2);
  
  console.log(account1.balance); // 1000
  console.log(account2.balance); // 1500