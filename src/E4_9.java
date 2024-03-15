/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 输出字符的Unicode值
 * @date 2024/03/15 19:54:55
 */
import java.util.Scanner;
public class E4_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个字符:");
        char in = input.nextLine().charAt(0);
        System.out.print(in+" 的Unicode值为：\\u");
        System.out.printf("%04X",(int)in);
    }
}
