//显示一年的天数
import test.Gyh;
public class E6_16 {
    public static void main(String[] args){
        for(int i=2000;i<=2020;i++){
            System.out.println(i+": "+numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        return Gyh.isLeapYear(year)? 366:365;
    }
}