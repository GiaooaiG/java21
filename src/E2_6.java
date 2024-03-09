//各位数相加
import java.util.Scanner;
public class E2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int num = input.nextInt();
        int result=0;
//新方法
        //while(条件)
        while(num>0){
            result += num % 10;
            num /= 10;
        }
/*原方法
        int bit = num % 10;
        int bit10 = (num / 10) % 10;
        int bit100 = (num % 1000 - bit10 * 10 - bit) / 100;
        int result = bit + bit10 + bit100;
        */
        System.out.print("各位数相加的结果是："+result);
    }
}