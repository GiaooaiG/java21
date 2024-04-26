import java.util.Scanner;
public class E11_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入三条边：");
        double a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        System.out.println("输入颜色：");
        String color=input.next();
        System.out.println("输入是否填充：");
        boolean filled;
        filled = input.nextInt() != 0;
        Triangle triangle = new Triangle(a,b,c,filled,color);
        System.out.println(triangle);
        System.out.println("Area:"+triangle.getArea());
        System.out.println("Perimeter:"+triangle.getPerimeter());
        System.out.println("Color:"+triangle.getColor());
        System.out.println("Filled:"+triangle.isFilled());
    }
}
