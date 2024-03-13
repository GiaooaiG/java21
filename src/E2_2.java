//计算圆柱体的体积
import java.util.Scanner;
public class E2_2 {
    public static void main(String[] args){
        final double PI = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.println("输入圆柱体的底面半径和高：");
        double r = input.nextDouble();
        double h = input.nextDouble();
        double v = PI *r *r *h;
        System.out.println("底面半径为 "+r+",高为 "+h+"的圆柱体,体积为: "+v);
    }
}
