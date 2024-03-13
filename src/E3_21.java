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
        int inputYear = input.nextInt();
        int inputMonth;
        do {
            System.out.print("输入月份：");
            inputMonth = input.nextInt();
        }while(inputMonth<1||inputMonth>12);
        int month=inputMonth;
        int year=inputYear;
        switch (inputMonth){
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
        //java12的新特性
        String weekDay = switch (h) {
            case 0 -> "六";
            case 1 -> "天";
            case 2 -> "一";
            case 3 -> "二";
            case 4 -> "三";
            case 5 -> "四";
            case 6 -> "五";
            default -> "";
        };
        System.out.print(inputYear+"年"+inputMonth+"月"+day+"日是星期"+weekDay);
    }
}
