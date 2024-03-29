//打印表格
public class E1_4 {
    public static void main(String[] args) {
        //"\t"为制表符
        System.out.println("a\ta^2\ta^3");
        System.out.println(1 + "\t" + square(1) + "\t" + cube(1));
        System.out.println(2 + "\t" + square(2) + "\t" + cube(2));
        System.out.println(3 + "\t" + square(3) + "\t" + cube(3));
        System.out.println(4 + "\t" + square(4) + "\t" + cube(4));
    }

    //输出数据类型 方法名(输入数据类型 变量名）
    public static int square(double num) {
        return (int) (Math.pow(num, 2) + 0.5);
    }

    public static int cube(double num) {
        return (int) (Math.pow(num, 3) + 0.5);
    }
}