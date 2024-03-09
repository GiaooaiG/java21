//计算小费
import java.util.Scanner;
public class E2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入消费金额：");
        double cost = input.nextDouble();
        System.out.print("输入小费比例（如15）:");
        double tipPercentage = input.nextDouble();
        double tip = cost * tipPercentage / 100;
        double totalCost = cost + tip;
        System.out.print("小费金额为:"+tip+"，总金额为："+totalCost);
    }
}
