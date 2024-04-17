import java.util.Date;


public class E9_7 {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        try {
            a.withDraw(2500);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
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
        if (annualInterestRate < 0) {
            throw new IllegalArgumentException("输入不能为负数");
        } else {
            this.annualInterestRate = annualInterestRate;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("输入不能为负数");
        } else {
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

    public void withDraw(double amount) throws Exception {
        if (amount < 0) {
            throw new IllegalArgumentException("输入不能为负数");
        } else if (balance < amount) {
            throw new Exception("余额不足");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("输入不能为负数");
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
}