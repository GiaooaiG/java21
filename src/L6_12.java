import java.util.Scanner;
import test.Gyh;
//显示日历
public class L6_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int[] BASE = new int[]{1800,1,1};
        final int BASE_WEEKDAY = 2;
        //获取年份和月份
        System.out.print("输入年份：");
        int year = input.nextInt();
        System.out.print("输入月份：");
        int month = input.nextInt();
        int[] date = new int[]{year,month,1};
        int weekDay = -1;
        for(int i = 0;i<=2;i++) {
            if (BASE[i] > date[i]) {
                weekDay = Gyh.weekDay(BASE_WEEKDAY,-1*Gyh.daysFrom(date,BASE));
            }else{
                weekDay = Gyh.weekDay(BASE_WEEKDAY,Gyh.daysFrom(BASE,date));
            }
        }
        printMonth(date,weekDay);
    }
    //打印日历
    public static void printMonth(int[] date,int weekday){
        System.out.println("          "+Gyh.nameOfMonth(date[1])+" "+date[0]);
        System.out.println("---------------------------");
        System.out.println("周日\t周一\t周二\t周三\t周四\t周五\t周六");
        for(int i = 1;i <= weekday;i++){
            System.out.print("\t");
        }
        for(int i = 1;i<=Gyh.daysOfMonth(date[0],date[1]);i++){
            System.out.print(i);
            if((i+weekday)%7==0){
                System.out.println();
                continue;
            }
            System.out.print("\t");
        }
    }
}
