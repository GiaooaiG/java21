//打印图案
public class E5_12 {
    public static void main(String[] args){
        a();
        b();
        c();
        d();
    }
    public static void a(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%4d",j);
            }
            System.out.println();
        }
    }
    public static void b(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=7-i;j++){
                System.out.printf("%4d",j);
          }
            System.out.println();
        }
    }
    public static void c(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("    ");
            }
            for(int j=6;j<=i&&j>0;j--){
                System.out.printf("%4d",j);
            }
            System.out.println();
        }
    }
    public static void d(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<i;j++){
                System.out.print("    ");
            }
            for(int j=1;j<=7-i;j++){
                System.out.printf("%4d",j);
            }
            System.out.println();
        }
    }
}
