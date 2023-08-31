public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();

        bank.deposit(1000);
        System.out.println("Balance: " + bank.getBalance());

        bank.withdraw(500);
        System.out.println("Balance: " + bank.getBalance());
    }
}
