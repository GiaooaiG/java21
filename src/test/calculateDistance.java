package test;

/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 计算两点之间的距离
 * @date 2024/03/11 19:14:51
 */
public class calculateDistance {
    public static double calculateDistance(double[] arr1,double[] arr2){
            double distance;
            distance=Math.sqrt(Math.pow(arr1[0]-arr2[0],2)+Math.pow(arr1[1]-arr2[1],2));
            return distance;
    }
}
