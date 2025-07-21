package bankAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("---CheckingAccount---");
        CheckingAccount ch= new CheckingAccount(2000,10,1500);
        System.out.println("Balans:  " + ch.balance);
        ch.deposit(400);
        ch.withdraw(1000);
        ch.deductFees();
        System.out.println("Final checking balance: "+ ch.getBalance());

        System.out.println("\n---SavingsAccount---");
        SavingsAccount sv= new SavingsAccount(1000,10);
        System.out.println("Balans:  " + sv.balance);
        sv.deposit(200);
        sv.withdraw(100);
        sv.calculateInterest();
        System.out.println("Final savings balance: " + sv.getBalance());
    }
}
