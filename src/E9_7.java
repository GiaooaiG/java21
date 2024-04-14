import java.util.Date;
import static java.lang.Math.abs;

public class E9_7 {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withDraw(2500);
        a.deposit(3000);
        System.out.println("Balance: " + a.getBalance());
        System.out.println("MonthlyInterest: " + a.getMonthlyInterest());
        System.out.println("Date Created: " + a.getDateCreated().toString());
    }
}

class Account {
    private final Date dateCreated;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account(int id, double balance) {
        this.setId(id);
        this.setBalance(balance);
        this.dateCreated = new Date();
    }

    public Account() {
        this(0, 0);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate > 0) {
            this.annualInterestRate = annualInterestRate;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
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

    public void withDraw(double amount) {
        amount = abs(amount);
        if (balance > amount) {
            setBalance(getBalance() - amount);
            System.out.println("取款成功");
        } else {
            System.out.println("余额不足！");
        }
    }

    public void deposit(double amount) {
        amount = abs(amount);
        setBalance(getBalance() + amount);
        System.out.println("存款成功");
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
}