import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class E12_17 {
    public static void main(String[] args) throws FileNotFoundException {
        File words = new File("src/test/words.txt");
        Scanner input = new Scanner(System.in);
        Scanner wordScanner = new Scanner(words);
        ArrayList<GuessWord> quizList = new ArrayList<>();
        while (wordScanner.hasNext()) {
            quizList.add(new GuessWord(wordScanner.next()));
        }
        quizList = shuffle(quizList);
        for (GuessWord quiz : quizList) {
            int n = 0;
            String word = quiz.getWord();
            do {
                System.out.print("输入字母：");
                String in = input.nextLine();
                for (int i = 0; i < in.length(); i++) {
                    char character = in.charAt(i);
                    if (!Character.isLetter(character)) {
                        System.out.println("请输入字母");
                        continue;
                    }
                    if (quiz.getTemp().indexOf(String.valueOf(character)) != -1) {
                        System.out.println("这个字母猜过了！");
                    } else if (!word.contains(String.valueOf(character))) {
                        System.out.println("单词里没有这个字母！");
                        n += 1;
                    } else {
                        System.out.println(quiz.guess(character));
                    }
                }
            } while (!quiz.finished());
            System.out.println("成功！");
            System.out.println("猜错次数：" + n);
            System.out.println("是否继续？");
            outer: while (true) {
                int i = input.nextInt();
                switch (i) {
                    case 0:
                        break outer;
                    case 1:
                        System.exit(0);
                    default:
                        System.out.println("输入0继续，输入1结束");
                }
            }
        }
    }
    static ArrayList<GuessWord> shuffle(ArrayList<GuessWord> arrayList){
        Random r = new Random();
        ArrayList<GuessWord> shuffledArrayList = new ArrayList<>();
        while(!arrayList.isEmpty()){
            int i = r.nextInt(arrayList.size());
            shuffledArrayList.add(arrayList.remove(i));
        }
        return shuffledArrayList;
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
