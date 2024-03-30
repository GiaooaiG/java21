//验证密码是否符合规范
import java.util.Scanner;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;
public class E6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Password:");
        String password = input.nextLine().trim();
        System.out.print(passwordCheck(password) ? "Valid Password" : "Invalid Password");
    }

    public static boolean passwordCheck(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            //n:数字个数
            int n = 0;
            for (int i = 0; i < password.length(); i++) {
                if (!isLetterOrDigit(password.charAt(i))) {
                    return false;
                } else if (isDigit(password.charAt(i))) {
                    n += 1;
                }
            }
            return n >= 2;
        }
    }
}