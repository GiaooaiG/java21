/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 计算星期几
 * @date 2024/03/11 15:17:49
 */
import java.util.Scanner;
public class E3_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入年份：");
        int year = input.nextInt();
        int month;
        do {
            System.out.print("输入月份：");
            month = input.nextInt();
        }while(month<1||month>12);
        switch (month){
            case 1:{
                year -= 1;
                month = 13;
                break;
            }
            case 2:{
                year -= 1;
                month = 14;
                break;
            }
        }
        int day;
        do{
            System.out.print("输入日期（1-31）：");
            day = input.nextInt();
        }while(day<1||day>31);
        //h是“星期几”
        int h;
        h = (day + 26*(month+1)/10 + (year%100) + (year%100)/ 4+ (year/100) / 4 + (year/100)* 5 )%7;
        switch (h){
            case 0:System.out.print("今天是星期六");break;
            case 1:System.out.print("今天是星期天");break;
            case 2:System.out.print("今天是星期一");break;
            case 3:System.out.print("今天是星期二");break;
            case 4:System.out.print("今天是星期三");break;
            case 5:System.out.print("今天是星期四");break;
            case 6:System.out.print("今天是星期五");break;
        }
    }
}
