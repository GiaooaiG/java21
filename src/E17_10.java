import java.io.*;
import java.util.ArrayList;
//有 bug ，没法正常写入
public class E17_10 {
    public static void main(String[] args) throws IOException {
        Spilt.main(new String[]{"src/test/Gyh.java", "3"});
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


        ArrayList<BufferedOutputStream> outputStreams = new ArrayList<>();
        ArrayList<File> targetFiles = new ArrayList<>();
        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile))
        ) {
            for (int i = 1; i <= numberOfPieces; i++) {
                targetFiles.add(new File(args[0] + "." + i));
            }
            for(File file : targetFiles){
                outputStreams.add(new BufferedOutputStream(new FileOutputStream(file)));
            }
            for (File targetFile : targetFiles) {
                targetFile.delete();
                targetFile.createNewFile();
            }
            int i;
            int sourceFileBytes = inputStream.available();
            for (BufferedOutputStream outputStream : outputStreams) {
                int bytesWritten = 0;
                while ((i = inputStream.read()) != -1){
                    System.out.println("Write:"+(byte)i);
                    outputStream.write((byte) i);
                    bytesWritten+=1;
                        if (bytesWritten >= sourceFileBytes/numberOfPieces){
                            break;
                        }
                    }
                outputStream.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(6);
        } finally {
            for (BufferedOutputStream outputStream : outputStreams) {
                outputStream.close();
            }
        }
        System.out.println("Finished");
        System.exit(0);
    }
}