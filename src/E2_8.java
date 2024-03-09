//显示当前时间
import java.util.Scanner;
public class E2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入相对GMT的时间偏移量(-12——12):");
        int gmtOffset = input.nextInt();
        long totalMilliSec = System.currentTimeMillis();
        long totalSec = (totalMilliSec + 500) / 1000 + (long)gmtOffset * 3600;
        long currentSec = totalSec % 60;
        long totalMin = totalSec / 60;
        long currentMin = totalMin % 60;
        long totalHour = totalMin / 60;
        long currentHour = totalHour % 24;
        System.out.print("现在时间是"+currentHour+":"+currentMin+":"+currentSec);
    }
}
