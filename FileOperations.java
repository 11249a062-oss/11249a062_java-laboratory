import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            // Create a file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a Java file operation program.\n");
            writer.write("This is the first line written to the file.");
            writer.close();

            // Append data to the file
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis line is appended to the file.");
            appendWriter.close();

            // Read data from the file
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            System.out.println("\nFile Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Display file information
            System.out.println("\nFile Name: " + file.getName());
            System.out.println("File Size: " + file.length() + " bytes");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
