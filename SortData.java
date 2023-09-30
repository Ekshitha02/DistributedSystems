import java.io.*;
import java.util.*;
import java.nio.file.*;

public class SortData {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: SortData <input_file> <temp_dir> <output_file>");
            System.exit(1);
        }

        String inputFile = args[0];
        String tempDir = args[1];
        String output = args[2];

        try {
            // Read lines from the input file into a list
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            // Sort the lines by the first column
            Collections.sort(lines, (line1, line2) -> {
                String[] parts1 = line1.split("_");
                String[] parts2 = line2.split("_");
                return parts1[0].compareTo(parts2[0]);
            });

            // Write the sorted lines to a temporary file
            Path tempFilePath = Paths.get(tempDir, "temp_sorted.txt");
            Files.write(tempFilePath, lines);

            // Rename the temporary file to the output file
            Files.move(tempFilePath, Paths.get(output), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Data has been sorted and stored in " + output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
