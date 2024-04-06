package test;

import java.util.Random;

public class Gyh {
    private Gyh(){}

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
    public static double distance(double[] arr1, double[] arr2) {
        double distance;
        distance = Math.sqrt(Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2));
        return distance;
    }

    //计算最小公约数
    public static int greatestCommonDivisor(int n1, int n2) {
        int gcd=1;
        for (int k=2;k<=n1&&k<=n2;k++){
            if (n1%k==0&&n2%k==0){
                gcd=k;
            }
        }
        return gcd;
    }

    //输入星期和天数，计算星期几（周日为0）
    public static int weekDay(int n1, int n2){
        return (n1+n2)%7;
    }

    //计算两个时间相差的天数
    public static int daysFrom(int[] date1,int[] date2){
        int year1 = date1[0];
        int year2 = date2[0];
        int month1 = date1[1];
        int month2 = date2[1];
        int day1 = date1[2];
        int day2 = date2[2];
        int result = 0;

        //计算开始年剩余天数
        for(int i = month1;i <=12;i++){
            result += daysOfMonth(year1,i);
        }
        result -= day1;
        //计算中间的整年的天数
        for(int i = year1 + 1;i < year2;i++){
            result += isLeapYear(i) ? 366:365;
        }
        //计算结束年的天数
        for(int i = 1;i < month2;i++) {
            result += daysOfMonth(year2,i);
        }
        result += day2;

        return result;
    }

    //判断是否为闰年
    public static boolean isLeapYear(int n1){
        return (n1 % 4 == 0 && n1 % 100 != 0) || (n1 % 400 == 0);
    }

    //返回每个月份的天数
    public static int daysOfMonth(int year,int month){
        return switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> isLeapYear(year) ? 29:28;
            case 4,6,9,11 -> 30;
            default -> 0;
        };
    }

    //返回每个月份的名字
    public static String nameOfMonth(int month){
        return switch(month){
            case 1 -> "一月";
            case 2 -> "二月";
            case 3 -> "三月";
            case 4 -> "四月";
            case 5 -> "五月";
            case 6 -> "六月";
            case 7 -> "七月";
            case 8 -> "八月";
            case 9 -> "九月";
            case 10 -> "十月";
            case 11 -> "十一月";
            case 12 -> "十二月";
            default -> "";
        };
    }

    //随机打乱数组元素
    public static int[] shuffle(int[] arr){
        Random r = new Random();
        for(int i = 0;i < arr.length;i++){
            int j = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
        return arr;
    }

    //Bubble Sort
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int a=1; a< arr.length;a++) {
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
            n-=1;
        }
        return arr;
    }
    public static double[] bubbleSort(double[] arr){
        int n = arr.length;
        for(int a=1; a< arr.length;a++) {
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
            n-=1;
        }
        return arr;
    }

    //返回数组的平均数
    public static double average(int[] arr){
        int sum=0;
        for(int i:arr){
            sum += i;
        }
        return sum/(double)arr.length;
    }
    public static double average(double[] arr){
        double sum=0;
        for(double i:arr){
            sum += i;
        }
        return sum/(double)arr.length;
    }
}