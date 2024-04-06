//升序排列
import test.Gyh;
import java.util.Arrays;
import java.util.Scanner;
public class E6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入三个数：");
        double[] in = new double[3];
        for(int i=0;i<=2;i++){
            in[i]=input.nextDouble();
        }
        System.out.print((Arrays.toString(Gyh.bubbleSort(in))));
    }
}