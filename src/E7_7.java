//生成100个0到9整数，统计每个数的数目
import java.util.Arrays;
public class E7_7 {
    public static void main(String[] args){
        int[] result = new int[]{0,0,0,0,0,0,0,0,0,0};
        for(int i=1; i <= 100; i++){
            result[(int)(Math.random()*10)]+=1;
        }
        System.out.print(Arrays.toString(result));
    }
}