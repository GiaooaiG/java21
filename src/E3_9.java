/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 计算ISBN校验和
 * @date 2024/03/11 14:24:22
 */
import java.util.Scanner;
public class E3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in;
        /*位数检测,无法解决开头是0的情况
        do {
            System.out.print("输入ISBN前9位：");
        in = input.nextInt();
        }while(in/1e8<1||in/1e8>=10);
         */
        System.out.print("输入ISBN前9位：");
        in = input.nextInt();
        int sum=  0;
        int temp = in;
        for(int i=1;i<=9;i+=1){
            sum += (temp % 10)*(10-i);
            temp /= 10;
        }
        int lastNum = sum % 11;
        //显示结果
        if(lastNum !=10){
            int isbn = (in * 10) + lastNum;
            System.out.printf("%010d",isbn);
        }else{
            System.out.printf("%09d",in);
            System.out.print("X");
        }
    }
}
