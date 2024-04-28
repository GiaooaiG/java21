public class P6_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Before  method1 call");
            method1();
            System.out.println("After  method1 call");
        }
        catch (Exception ex) {
            System.out.println("Catch an exception! ");
        }
        finally {
            System.out.println("The finally clause is executed");
        }
        System.out.println("Main method is over");
    }
    public static void method1() throws Exception {
        try {
            System.out.println("Before  method2 call");
            method2();
            System.out.println("After  method2 call");
        }
        catch (Exception ex) {
            System.out.println("Catch an exception!");
            throw new Exception("New info from method1", ex);
        }
    }
    public static void method2() throws Exception {
        System.out.println("Method2 is called.");
        throw new Exception("New info from method2");
    }
}
