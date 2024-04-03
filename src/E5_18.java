//打印图案
public class E5_18 {
    public static void main(String[] args){
        a();
        System.out.println();
        b();
        System.out.println();
        c();
        System.out.println();
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
            for(int j=6;j>=1;j--){
                if(j<=i){
                    System.out.printf("%4d",j);
                }
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