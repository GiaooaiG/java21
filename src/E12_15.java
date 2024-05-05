import java.io.*;
import java.util.*;

public class E12_15 {
    public static void main(String[] args) {
        File file = new File("src/test/E12_15.txt");
        file.delete();
        Random random = new Random();
        try (PrintWriter printWriter = new PrintWriter(file)) {
            file.createNewFile();
            for (int i = 0; i < 10; i++) {
                printWriter.print(random.nextInt(101));
                printWriter.print(" ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Integer> nums = new ArrayList<>(10);
        try (Scanner scanner = new Scanner(file)){
            do {
                nums.add(scanner.nextInt());
            } while (scanner.hasNext());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
    }
}
