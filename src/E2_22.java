//将金额转换为较小货币单位
import java.util.Scanner;
public class E2_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入美分数量：");
        int cents = input.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        int quarters = remainingCents / 25;
        remainingCents %= 25;
        int dimes = remainingCents / 10;
        remainingCents %= 10;
        int nickels = remainingCents / 5;
        remainingCents %= 5;
        int pennis = remainingCents;
        System.out.println(cents+"美分是:");
        System.out.println(dollars+"\tdollars");
        System.out.println(quarters+"\tquarters");
        System.out.println(dimes+"\tdimes");
        System.out.println(nickels+"\tnickels");
        System.out.print(pennis+"\tpennis");
    }
}