//计算利息
import java.util.Scanner;
public class E2_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入存款金额:");
        double money = input.nextDouble();
        System.out.print("输入年利率（省略百分号）：");
        double annualRate = input.nextDouble() / 100d;
        System.out.print("输入存款月份：");
        int month = input.nextInt();
        double monthlyRate = annualRate / 12d;
        double finalMoney = money;
        for(int i = 1;i<=month;i+=1){
            finalMoney *= 1 + monthlyRate;
        }
        System.out.print(money+"元在"+100*annualRate+"％的年利率下存"+month+"月,得到"
        +finalMoney+"元。");
    }
}