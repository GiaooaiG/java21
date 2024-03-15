package test;
public class Gyh {

    //判断一个数是否在数组里
    public static boolean contains(int[] arr,int num){
        for(int i:arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    //计算两个点之间的距离
    public static double calculateDistance(double[] arr1,double[] arr2){
        double distance;
        distance=Math.sqrt(Math.pow(arr1[0]-arr2[0],2)+Math.pow(arr1[1]-arr2[1],2));
        return distance;
    }
}
