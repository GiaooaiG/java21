public class E12_1 {
    public static void main(String[] args) {
        try {
            System.out.println(new Calculator(args).getResult());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

//命令行计算器
class Calculator {
    private final double firstNum;
    private final char operator;
    private final double secondNum;
    private final double result;

    public Calculator(double firstNum, char operator, double secondNum) {
        this.firstNum = firstNum;
        if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
            throw new IllegalArgumentException("错误的运算符号：" + operator);
        }
        this.operator = operator;
        this.secondNum = secondNum;
        this.result = switch (this.operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> firstNum / secondNum;
            default -> throw new IllegalArgumentException("错误的运算符号：" + operator);
        };
    }

    public Calculator(String[] args) {
        double firstNum, secondNum;
        if (args.length != 3) {
            throw new IllegalArgumentException("输入格式错误");
        }
        try {
            firstNum = Double.parseDouble(args[0]);
        } catch (Exception ex) {
            throw new NumberFormatException("错误的数字：" + args[0]);
        }
        try {
            secondNum = Double.parseDouble(args[2]);
        } catch (Exception ex) {
            throw new NumberFormatException("错误的数字：" + args[0]);
        }
        if (args[1].length() != 1) {
            throw new IllegalArgumentException(("错误的运算符号:" + args[2]));
        }
        char operator = args[1].charAt(0);
        if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
            throw new IllegalArgumentException("错误的运算符号：" + operator);
        }
        this.firstNum = firstNum;
        this.operator = operator;
        this.secondNum = secondNum;
        this.result = switch (this.operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            case '/' -> firstNum / secondNum;
            default -> throw new IllegalArgumentException("错误的运算符号：" + operator);
        };
    }

    public double getFirstNum() {
        return firstNum;
    }

    public char getOperator() {
        return operator;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public double getResult() {
        return result;
    }
}