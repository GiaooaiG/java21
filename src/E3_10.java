/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 小于100内两个数加法游戏
 * @date 2024/03/15 19:29:24
 */
import java.util.Scanner;
public class E3_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);
        if(a<b){
            int temp = a;
            a=b;
            b=temp;
        }
        System.out.print("计算"+a+"+"+b+"：");
        int in = input.nextInt();
        int answer = a+b;
        if(in!=answer){
            System.out.print("错误，正确答案是"+answer);
        }else{
            System.out.print("正确");
        }
    }
}
