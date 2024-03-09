/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 计算BMI
 * @date 2024/03/05 19:52:37
 */
import java.util.Scanner;
public class E2_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入身高(m)：");
        double height = input.nextDouble();
        System.out.print("输入体重(kg)：");
        double weight = input.nextDouble();
        double BMI = weight / height / height;
        System.out.print("你的BMI为："+( (int)( (BMI * 100)+0.5) )/100d);
    }
}