//将摄氏温度转为华氏温度
import java.util.Scanner;
public class E2_1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入摄氏度：");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * (9/5d) + 32;
        System.out.print("摄氏 "+celsius+" 度是 "+fahrenheit+" 华氏度");
    }
}