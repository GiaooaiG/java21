/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 求解2*2线性方程
 * @date 2024/03/08 11:03:47
 */
import java.util.Scanner;
public class E3_3 {
/* 原做法
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入a b c d e f");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double temp = a*d-b*c;
        if(temp==0){
            System.out.print("无解");
        }
        else{
            double x = (e*d-b*f)/(temp);
            double y = (a*f-e*c)/(temp);
            System.out.print("x="+x+",y="+y);
        }
    }
*/
    //新做法
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入a b c d e f");
        double[] in = new double[6];
        for (int i=1;i<=6;i+=1){
            in[i-1]= input.nextDouble();
        }
        double[] out =linear_equation_2_2(in);
        if (out.length == 2) {
            double x = out[0];
            double y = out[1];
            System.out.print("x="+x+",y="+y);
        }
        else if(out.length == 1)
            System.out.print("无解");
        else if(out.length == 0)
            //后面发现不会出现这种情况，输入不到6个程序就不会继续运行
            System.out.print("输入错误");
    }
    public static double[] linear_equation_2_2(double[] in) {
        if (in.length != 6) {
            //后面发现不会出现这种情况，输入不到6个程序就不会继续运行
            return new double[0];
        } else if (in[0] * in[3] == in[1] * in[2]) {
            return new double[1];
        } else {
            double[] out = new double[2];
            out[0] = (in[4]*in[3]-in[1]*in[5])/(in[0]*in[3]-in[1]*in[2]);
            out[1] = (in[0]*in[5]-in[4]*in[2])/(in[0]*in[3]-in[1]*in[2]);
            return out;
        }
    }
}
