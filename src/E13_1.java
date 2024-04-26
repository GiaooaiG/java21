import java.util.Scanner;
public class E13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入三条边：");
        double a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        System.out.println("输入颜色");
        String color=input.next();
        System.out.println("输入是否填充：");
        boolean filled;
        filled = input.nextInt() != 0;
        Triangle triangle = new Triangle(a,b,c,filled,color);
        try {
            Triangle triangle2 = (Triangle) triangle.clone();
            System.out.println(triangle==triangle2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
abstract class GeometricObject{
    private boolean filled;
    private String color;

    public GeometricObject(boolean filled,String color){
        this.color=color;
        this.filled=filled;
    }
    public GeometricObject(){
        this(false,"black");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }
}
class Triangle extends GeometricObject implements Cloneable{
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c,boolean filled,String color){
        this.a=a;
        this.b=b;
        this.c=c;
        this.setFilled(filled);
        this.setColor(color);
    }
    public Triangle(){
        this(1,1,1,false,"black");
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}