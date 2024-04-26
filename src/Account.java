import java.util.Date;

public class Account {
    private final Date dateCreated = new Date();
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account(int id, double balance) {
        this.setId(id);
        this.setBalance(balance);
    }

    public Account() {
        this(0, 0);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void withDraw(double amount) throws Exception {
        if (amount < 0) {
        throw new IllegalArgumentException("取款金额不能为负数！");
    } else {
            setBalance(getBalance() - amount);
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("存款金额不能为负数！");
        } else {
            setBalance(getBalance() + amount);
        }
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    @Override
    public String toString(){
        return "Account:\nid:"+getId()+"\nbalance:"+getBalance();
    }
}

class SavingsAccount extends Account{
    public SavingsAccount(){
        super();
    }
    public SavingsAccount(int id,double balance) {
        super(id, balance);
    }

    @Override
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("设置余额不能为负数！");
        } else {
            super.setBalance(balance);
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
       if (getBalance() < amount) {
            throw new Exception("取款余额不足！");
        } else {
            super.withDraw(amount);
        }
    }
    @Override
    public String toString(){
        return "SavingsAccount:\nid:"+getId()+"\nbalance:"+getBalance();
    }

}
class CheckingAccount extends Account{
    private double quota=0;
    public CheckingAccount(int id,double balance,double quota){
        super(id,balance);
        this.quota=quota;
    }
    public CheckingAccount(){
        super();
    }
    public CheckingAccount(int id,double balance){
        super(id,balance);
    }
    public double getQuota(){
        return this.quota;
    }
    public void setQuota(double quota){
        this.quota=quota;
    }
    @Override
    public void setBalance(double balance) {
        if(balance<-1*quota){
            throw new IllegalArgumentException("设置余额超出透支范围！");
        }else {
            super.setBalance(balance);
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (this.getBalance() < amount+quota) {
            throw new Exception("取款超出透支范围！");
        } else {
            super.withDraw(amount);
        }
    }
    @Override
        public String toString(){
            return "CheckingAccount:\nid:"+getId()+"\nbalance:"+getBalance();
        }

}
