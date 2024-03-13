/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 牛顿迭代法求平方根
 * @date 2024/03/13 19:26:45
 */
import java.util.Scanner;
public class FUCKMATLAB {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a;
        do{
            System.out.print("输入要开方的数:");
            a=input.nextDouble();
        }while(a<0);
        double x=1;
        int i=0;
        outer:while (true){
            double x1;
            x1 = 0.5d *(x+a/x);
            if(Math.abs(x1-x)<=10e-5){
                break outer;
            }else{
                i+=1;
            }
            x=x1;
        }
        System.out.print(a+"开方后是"+x+"，迭代了"+i+"次");
    }
}
