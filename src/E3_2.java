/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 将三个随机数相加
 * @date 2024/03/08 10:55:05
 */
import java.util.Scanner;
public class E3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =(int)(Math.random() * 10);
        int b =(int)(Math.random() * 10);
        int c =(int)(Math.random() * 10);
        System.out.println("输入"+a+"+"+b+"+"+c+"的结果：");
        int ans = input.nextInt();
        if(ans == a+b+c){
            System.out.print("正确");
        }
        else{
            System.out.print("错误");
        }
    }
}