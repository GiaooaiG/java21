import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E12_11 {
    public static void main(String[] args) throws IOException {
        String in = args[0];
        String delete = args[1];
        File file = new File("src/test", in);
        if (!file.exists()) {
            throw new FileNotFoundException("找不到" + file.getAbsolutePath());
        }
        Scanner scanner = new Scanner(file);
        StringBuilder string = new StringBuilder();
        while (scanner.hasNext()) {
            string.append(scanner.nextLine().replaceAll(delete, ""));
            string.append("\n");
        }
        if (file.delete() && file.createNewFile()) {
            try (PrintWriter printWriter = new PrintWriter(file)
            ) {
                printWriter.print(string);
            }
        }
        System.out.print("Success");
    }
}