public class E9_7 {
    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(1122, 20000);
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

