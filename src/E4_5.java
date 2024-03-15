/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 计算正多边形的面积
 * @date 2024/03/15 19:37:43
 */
import java.util.Scanner;
public class E4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //n为边数,s为边长
        int n,s;
        do{
            System.out.print("输入正多边形的边数:");
            n = input.nextInt();
        }while(n<3);
        do{
            System.out.print("输入正多边形的边长:");
            s = input.nextInt();
        }while(s<0);
        double space = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI/n));
        System.out.printf("面积为："+"%.2f",space);
    }
}
