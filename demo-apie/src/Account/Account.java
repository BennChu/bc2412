package Account;
public abstract class Account {
    
    //如果用 attribute 做 account type
    //壞處: 首先唔係 OOP 理念
    //壞處: 唔可以有自己 method, 困係自己 class 裹面
    //真實出現唔係 account, 係 saving acc, current acc
    private long id;
    private Currency currency;
    private double balance;

    //constructor
    public Account(long id, Currency currency, double balance) {
        this.id = id;
        this.currency = currency;
        this.balance = balance;
    }

    //instance method
    public long getId() {
        return this.id;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double money) {
        return this.balance = this.balance + money;
    }

    public double withdrawal(double money) {
        return this.balance = this.balance - money;
    }

    //public void transfer( )

    




}
