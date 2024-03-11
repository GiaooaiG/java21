/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 对三个整数排序
 * @date 2024/03/11 14:05:07
 */
import java.util.Scanner;
public class E3_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入三个整数:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp;
        if(a > b){
            temp=a;a=b;b=temp;
        }
        if(a > c){
            temp=c;c=b;b=a;a=temp;
        }
        if(b > c){
            temp=c;c=b;b=temp;
        }
        System.out.print(a+","+b+","+c);
    }
}
