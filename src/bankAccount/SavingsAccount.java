package bankAccount;

public class SavingsAccount extends AbstractBankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest(){
        double interest= (balance * interestRate)/100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}
