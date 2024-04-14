import java.util.Scanner;

//ATM游戏
public class E10_7 {
    public static void main(String[] args) {
        //初始化
        Scanner input = new Scanner(System.in);
        final Account[] ACCOUNTS = new Account[10];
        for (int i = 0; i < 10; i++) {
            ACCOUNTS[i]=new Account(i,100);
        }

        int id,choice;
        id=askForID();
        //设置了id为-1时退出
        while(id!=-1) {
            printMenu();
            choice = askForChoice();
            switch (choice) {
                case 1:
                    System.out.println("余额为：" + ACCOUNTS[id].getBalance());
                    continue;
                case 2: {
                    System.out.println("请输入取款金额：");
                    ACCOUNTS[id].withDraw(input.nextDouble());
                    continue;
                }
                case 3: {
                    System.out.println("请输入存款金额：");
                    ACCOUNTS[id].deposit(input.nextDouble());
                    continue;
                }
                case 4:
                    System.out.println("注销成功\n");
                    id=askForID();
            }
        }
    }

    //设置了id为-1时退出，所以允许-1输入
    private static int askForID(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入id：");
        int in;
        in=input.nextInt();
        if((in<0&in!=-1)|in>9){
            do{
                System.out.print("id范围为0-9，请重新输入id：");
                in=input.nextInt();
            }while((in<0&in!=-1)|in>9);
        }
        return in;
    }
    private static int askForChoice(){
        Scanner input = new Scanner(System.in);
        System.out.print("请选择：");
        int in;
        in=input.nextInt();
        if(in<1|in>4){
            do{
                System.out.print("选择范围为1-4，请重新输入选择：");
                in=input.nextInt();
            }while(in<0|in>9);
        }
        return in;
    }
    private static void printMenu(){
        System.out.println("\n主菜单");
        System.out.println("1:查询余额");
        System.out.println("2:取款");
        System.out.println("3:存款");
        System.out.println("4:注销");
    }
}
