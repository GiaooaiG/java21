public class E9_1 {
    public static void  main(String[] args) throws Exception {
        Rectangle a = new Rectangle(4,40);
        Rectangle b = (Rectangle) a.clone();
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }

/*
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 40);
        Rectangle b = new Rectangle(3.5, 35.9);
        System.out.println(a.getWidth());
        System.out.println(a.getHeight());
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println();
        System.out.println(b.getWidth());
        System.out.println(b.getHeight());
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
    }
*/
}
//矩形类
class Rectangle implements Cloneable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1, 1);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}