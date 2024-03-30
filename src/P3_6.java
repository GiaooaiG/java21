//随机产生10个大于等于0、小于等于100的整数然后计算它们的总和、平均值和最大值
import java.util.Arrays;
import java.util.Random;
public class P3_6 {
    public static void main(String[] args){
        Random r = new Random();
        final int n=10;
        int[] nums = new int[n];
        int sum = 0,max=0;
        for(int i =0; i<n;i++){
            nums[i] =r.nextInt(101);
            sum+=nums[i];
            if(nums[i]>max){
                max=nums[i];
            }
        }
        double avg = sum/(double)n;
        System.out.println("nums:"+ Arrays.toString(nums));
        System.out.println("sum:"+ sum);
        System.out.println("avg:"+ avg);
        System.out.println("max:"+ max);
    }
}