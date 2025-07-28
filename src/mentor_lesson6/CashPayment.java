package mentor_lesson6;

public class CashPayment implements Payment {
    private Double balance=500d;
    private Boolean success= false;

    @Override
    public Boolean pay(Double amount) {
       try{
           if(amount>balance){
               throw new RuntimeException("Kifayet qeder balans yoxdur");
           }
       }catch(RuntimeException e){
           System.out.println(e.getMessage());
       }
       return success; // error vermesin deye muveqqeti yazilib
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
