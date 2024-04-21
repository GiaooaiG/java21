public class E10_3 {
    public static void main(String[] args) {
        MyInteger x1 = new MyInteger(13);
        MyInteger x2 = new MyInteger(3);
        System.out.println(x1.getValue());
        System.out.println(x1.isEven());
        System.out.println(x1.isOdd());
        System.out.println(x1.isPrime());
        System.out.println(MyInteger.isEven(2));
        System.out.println(MyInteger.isOdd(2));
        System.out.println(MyInteger.isPrime(2));
        System.out.println(MyInteger.isEven(x2));
        System.out.println(MyInteger.isOdd(x2));
        System.out.println(MyInteger.isPrime(x2));
        System.out.println(x1.equals(13));
        System.out.println(x1.equals(new MyInteger(13)));
        System.out.println(MyInteger.parseInt(new char[]{'1', '1'}));
        System.out.println(MyInteger.parseInt("11"));
    }
}

class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {
        throw new IllegalArgumentException("MyInteger类不支持无参构造");
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isEven(MyInteger myInteger) {
        return isEven(myInteger.getValue());
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1 | value % 2 == -1;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return isOdd(myInteger.getValue());
    }

    public static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        } else {
            double n = Math.sqrt(value);
            for (int i = 2; i <= n; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.getValue());
    }

    public static int parseInt(char[] value) {
        return Integer.parseInt(String.valueOf(value));
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(this.value);
    }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    public boolean equals(MyInteger integer) {
        return this.value == integer.value;
    }

    public boolean equals(int value) {
        return this.value == value;
    }
}