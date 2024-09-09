package Exercise1;

import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class p100 {

    private final static String AUTHOR ="Asifkhan";

    public static void main(String[] args) {
        // Specify the directory containing Java files
        String directoryPath ="C:\\Users\\Administrator\\eclipse-workspace\\WirpoPrograms\\src\\Package7";

        try {
            File[] javaFiles = getJavaFiles(directoryPath);

            if (javaFiles != null) {
                for (File file : javaFiles) {
                    addHeaderToFile(file);
                }
                System.out.println("File creation date and author name added to all Java files.");
            } else {
                System.out.println("The specified directory does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File[] getJavaFiles(String directoryPath) throws IOException {
        File dir = new File(directoryPath);
        if (dir.isDirectory()) {
            return dir.listFiles((d, name) -> name.endsWith(".java"));
        } else {
            throw new IOException("Directory does not exist: " + directoryPath);
        }
    }

    private static void addHeaderToFile(File file) throws IOException {
        // Read the existing content of the file
        String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));

        // Prepare the new header
        String header = "/**\n" +
                        " * Author: " + AUTHOR + "\n" +
                        " * Date: " + new Date() + "\n" +
                        " */\n\n";

        // Add the header to the existing content
        String newContent = header + content;

        // Write the updated content back to the file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(newContent);
        }
    }
}