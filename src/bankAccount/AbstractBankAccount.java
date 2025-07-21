package bankAccount;

public abstract class AbstractBankAccount implements BankAccount {
    protected double balance;

    public AbstractBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount < 0");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0 || balance < amount) {
            throw new IllegalArgumentException("amount < 0 or balance < amount");
        }
        balance -= amount;
            System.out.println("Withdrawn: " + amount);
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
