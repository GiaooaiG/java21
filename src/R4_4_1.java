/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 字符串处理
 * @date 2024/03/15 20:04:30
 */
public class R4_4_1 {
    public static void main(String[] args) {
        final String S1 = "Welcome to Java";
        final String S2 = "Programming is fun";
        final String S3 = "Welcome to Java";
        boolean a = (S1 == S2);
        boolean b = (S2 == S3);
        boolean c = S1.equals(S2);
        boolean d = S1.equals(S3);
        int e = S1.compareTo(S2);
        int f = S2.compareTo(S3);
        int g = S2.compareTo(S2);
        char h = S1.charAt(0);
        int i = S1.indexOf('j');
        int j = S1.indexOf("to");
        int k = S1.lastIndexOf('a');
        int l = S1.lastIndexOf("o", 15);
        int m = S1.length();
        String n = S1.substring(5);
        String o = S1.substring(5, 11);
        boolean p = S1.startsWith("Wel");
        boolean q = S1.endsWith("Java");
        String r = S1.toLowerCase();
        String s = S1.toUpperCase();
        String t = S1.concat(S2);
        boolean u = S1.contains(S2);
        String v = "\t Wel \t".trim();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        System.out.println("o: " + o);
        System.out.println("p: " + p);
        System.out.println("q: " + q);
        System.out.println("r: " + r);
        System.out.println("s: " + s);
        System.out.println("t: " + t);
        System.out.println("u: " + u);
        System.out.println("v: " + v);
    }
}

