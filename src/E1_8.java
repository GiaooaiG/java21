//圆的面积和周长
public class E1_8 {
    public static void main(String[] args){
        double r,s,c,pi;
        pi = 3.14159;
        r = 5.5;
        s = pi * r * r;
        c = 2 * pi * r;
        //"\n"为换行符
        System.out.print("半径为5.5的圆面积为：" +s+"\n周长为： "+c);
    }
}