/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 彩票36选7
 * @date 2024/03/08 16:46:55
 */
import java.util.*;
public class L3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入的数字
        int[] inputNum = new int[7];
        System.out.println("接下来输入1到36的数字");
        int i = 1;
        while (i <= 7) {
            System.out.print("请输入第" + i + "个数字：");
            int num = input.nextInt();
            if (num < 1 || num > 36) {
                System.out.println("输入的数字不在1-36范围内!");
            } else if (contains(inputNum, num)) {
                System.out.println("输入的数字有重复！");
            } else {
                inputNum[i - 1] = num;
                i += 1;
            }
        }
        int[] winningNum = new int[7];
        Random r = new Random();
        i = 1;
        while (i <= 7) {
            int randomNum;
            do{
                randomNum = (r.nextInt(37) + 1);
            }while(contains(winningNum,randomNum));
                winningNum[i-1] = randomNum;
                i += 1;
        }
        System.out.println("现在开始公布号码：");
        System.out.println("你选择的号码为：");
        for (int a : inputNum)
            System.out.print(a + " ");
        System.out.println("\n中奖的号码为：");
        for (int a : winningNum)
            System.out.print(a + " ");
        int matchingNum = 0;
        for (int a : inputNum) {
            for (int b : winningNum) {
                if (a == b)
                    matchingNum += 1;
            }
        }
        System.out.println("\n相同的数字数为："+matchingNum);
        if(matchingNum<=3){
            System.out.print("很遗憾，你没中奖");
        } else if (matchingNum==4) {
            System.out.print("恭喜你，你中了四等奖！");
        }else if (matchingNum==5) {
            System.out.print("恭喜你，你中了三等奖！");
        }else if (matchingNum==6) {
            System.out.print("恭喜你，你中了二等奖！");
        }else if (matchingNum==7) {
            System.out.print("恭喜你，你中了一等奖！");
        }
    }
    //判断一个数是否在数组里
    public static boolean contains(int[] arr,int num){
        for(int i:arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}