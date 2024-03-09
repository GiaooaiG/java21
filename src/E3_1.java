//求解一元二次方程
import java.util.Scanner;
public class E3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ax^2 + Bx + C =0，请输入A B C：");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = Math.pow(b,2) - 4 * a * c;
        if(delta<0){
            System.out.print("无实数解");
        } else if (delta==0) {
            double x = - b / (2 * a);
            System.out.print("有一个实数解，为" + x);
        } else {
            double x1 = (-b - Math.pow(delta,0.5)) / (2 * a);
            double x2 = (-b + Math.pow(delta,0.5)) / (2 * a);
            if(x1-x2<0){
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }
            System.out.print("有两个实数解，x1="+x1+",x2="+x2);
        }
    }
}