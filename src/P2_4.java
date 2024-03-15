/**
 * @author Gyh
 * @version 1.0
 * @project java21
 * @description 百分制成绩转换为五分制
 * @date 2024/03/15 19:10:57
 */
import java.util.Scanner;
public class P2_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double mark;
        do{
            System.out.print("输入成绩(0-100)：");
            mark = input.nextDouble();
        }while(mark<0||mark>100);
        char grade;
        switch ((int)(mark/10)){
            case 10,9:grade='A';break;
            case 8:grade='B';break;
            case 7:grade='C';break;
            case 6:grade='D';break;
            default:grade='E';break;
        }
/*
        //等同于
        char grade = switch ((int) (mark / 10)) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'E';
        };
 */
        System.out.print(mark+"分转换为五分制为："+grade);
    }
}
