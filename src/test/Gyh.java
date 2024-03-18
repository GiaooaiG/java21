package test;
public class Gyh {

    //判断一个数是否在数组里
    public static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    //计算两个点之间的距离
    public static double Distance(double[] arr1, double[] arr2) {
        double distance;
        distance = Math.sqrt(Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2));
        return distance;
    }

    //计算最小公约数
    public static int GreatestCommonDivisor(int n1, int n2) {
        int gcd=1;
        for (int k=2;k<=n1&&k<=n2;k++){
            if (n1%k==0&&n2%k==0){
                gcd=k;
            }
        }
        return gcd;
    }
}