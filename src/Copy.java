import java.io.*;

public class Copy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage:Copy sourceFile targetFile");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        File targetFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("sourceFile does not exist!");
            System.exit(2);
        }
        if (targetFile.exists()) {
            System.out.println("targetFile already existed!");
            System.exit(3);
        }
        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(args[1]))
        ) {
            long bytesWritten = 0;
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
                bytesWritten += 1;
            }
            System.out.println("BytesWritten:" + bytesWritten);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
