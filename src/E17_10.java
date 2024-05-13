import java.io.*;
import java.util.ArrayList;

public class E17_10 {
    public static void main(String[] args) throws IOException {
        Spilt.main(new String[]{"src/test/Copy.txt", "3"});
        System.exit(0);
    }
}

class Spilt {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: sourceFile numberOfPieces");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("SourceFile does not exist!");
            System.exit(2);
        }
        if (!sourceFile.canRead()) {
            System.out.println("Can't read sourceFile");
            System.exit(3);
        }
        int numberOfPieces = Integer.parseInt(args[1]);
        if (numberOfPieces <= 0) {
            System.out.println("NumberOfPieces must be greater than 0");
            System.exit(4);
        }
        ArrayList<File> targetFiles = new ArrayList<>();
        ArrayList<BufferedOutputStream> outputStreams = new ArrayList<>();
        try {
            for (int i = 1; i <= numberOfPieces; i++) {
                targetFiles.add(new File(args[0] + "." + i));
                outputStreams.add(new BufferedOutputStream(new FileOutputStream(targetFiles.get(i - 1))));
            }
            for (File targetFile : targetFiles) {
                targetFile.delete();
                targetFile.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(5);
        }
        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile))
        ) {
            int i;
            int sourceFileBytes = inputStream.available();
            for (BufferedOutputStream outputStream : outputStreams) {
                for (int j = 0; (j < sourceFileBytes / numberOfPieces) & ((i = inputStream.read()) != -1); j++) {
                    outputStream.write((byte) i);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(6);
        } finally {
            for (BufferedOutputStream outputStream : outputStreams) {
                outputStream.close();
            }
        }
        System.out.println("finish");
        System.exit(0);
    }
}