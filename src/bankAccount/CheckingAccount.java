package bankAccount;

public class CheckingAccount extends AbstractBankAccount{
    private double fee;
    private double balanceLimit;

    public CheckingAccount(double balance, double fee, double balanceLimit) {
        super(balance);
        this.fee = fee;
        this.balanceLimit = balanceLimit;
    }

    public void deductFees(){
        if(balance < balanceLimit){
            balance -= fee;
            System.out.println("Fee deducted: "+ fee);
        }
    }

}
