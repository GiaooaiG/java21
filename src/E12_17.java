import java.util.Scanner;
public class E12_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GuessWord quiz1 = new GuessWord("WowWorld");
        int n = 0;
        String word = quiz1.getWord();
        do {
            System.out.print("输入字母：");
            Character in = input.nextLine().charAt(0);
            if (!Character.isLetter(in)){
                throw new IllegalArgumentException("请输入字母");
            }
            if (quiz1.getTemp().indexOf(String.valueOf(in))!=-1){
                System.out.println("这个字母猜过了！");
            } else if (!word.contains(String.valueOf(in))) {
                System.out.println("单词里没有这个字母！");
                n += 1;
            }else {
                System.out.println(quiz1.guess(in));
            }
        }while(!quiz1.finished());
        System.out.println("成功！");
        System.out.println("猜错次数："+n);
    }
}
class GuessWord{
    private final String word;
    private final StringBuilder temp;

    public GuessWord(){
        this("");
    }

    public GuessWord(String word){
        this.word=word.toLowerCase();
        this.temp = new StringBuilder(word.length());
        temp.append("*".repeat(word.length()));
    }

    public String guess(char c){
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==c){
                temp.replace(i,i+1, String.valueOf(c));
            }
        }
        return temp.toString();
    }

    public boolean finished(){
        return word.contentEquals(temp);
    }

    public String getWord(){
        return word;
    }

    public StringBuilder getTemp() {
        return temp;
    }
}