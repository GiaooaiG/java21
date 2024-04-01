import test.Gyh;

import java.util.Scanner;

//输入十个数，求平均值
public class E7_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] inputInt = new int[10];
        double[] inputDouble = new double[10];
        System.out.println("输入十个整数：");
        for(int i=0;i<10;i++){
            inputInt[i]=input.nextInt();
        }
        System.out.println("平均值："+ Gyh.average(inputInt));
        System.out.println("输入十个数：");
        for(int i=0;i<10;i++){
            inputDouble[i]=input.nextDouble();
        }
        System.out.println("平均值："+ Gyh.average(inputDouble));
    }
}
