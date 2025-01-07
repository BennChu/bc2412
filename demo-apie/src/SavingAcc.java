public class SavingAcc extends Account{
    
    //真身係 saving account, 真正出現係現實世界
    private long id;
    private Currency currency;
    private double balance;

    public SavingAcc(long id, Currency currency, double balance) {
        super(id, currency, 0.0);//if no super, no call parent class, leading to error
                                   //Error: Implicit super constructor Account() is undefined
                                   //係 parent class 做一個 empty constructor then is ok
        // this.id = id;
        // this.currency = currency;
        // this.balance = balance;
    }   


    public static void main(String[] args) {
        Account savingAcc1 = new SavingAcc(001, Currency.HKD, 1000.0);

        savingAcc1.deposit(1000);
        System.out.println(savingAcc1.getBalance());//child class has no getBalance()
                                                    //parent class has
    }
}
