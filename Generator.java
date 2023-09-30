import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("java DatasetGenerator <num_entries> <output_file>");
            return;
        }

        int numofEntries = Integer.parseInt(args[0]);
        String outputFile = args[1];

        try {
            long startTime = System.currentTimeMillis();
            generateEntriesToFile(numofEntries, outputFile);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.println("Entries generated successfully.");
            System.out.println("Execution time: " + executionTime + " ms");

        } catch (IOException e) {
            System.err.println("Error writing to the output file: " + e.getMessage());
        }
    }

    // Inner class for calculating throughput
    static class ThroughputCalculator {
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Usage: java ThroughputCalculator <total_data_size_MiB> <execution_time_ms>");
                return;
            }

            double totalDataSizeMiB = Double.parseDouble(args[0]);
            double executionTimeMs = Double.parseDouble(args[1]);

            // Calculate throughput in MiB/s
            double throughput = (totalDataSizeMiB / (executionTimeMs / 1000.0));

            System.out.println("Throughput: " + throughput + " MiB/s");
        }
    }

    public static void generateEntriesToFile(int numofEntries, String outputFile) throws IOException {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int k = 0; k < numofEntries; k++) {
                // Generate random integer (up to 8 digits)
                int randomInt = random.nextInt(100000000);
                String randomIntStr = String.format("%08d", randomInt);

                // Generate sequence number (incremental)
                String sequenceNumber = String.format("%010d", k);

                // Generate random alphanumeric string with newline character
                StringBuilder randomString = new StringBuilder(46);
                for (int p = 0; p < 45; p++) {
                    char randomChar = (char) (random.nextInt(26) + 'a');
                    randomString.append(randomChar);
                }
                randomString.append('\n');

                // Write entry to the file
                writer.write(randomIntStr + "_" + sequenceNumber + "_" + randomString.toString());
            }
        }
    }
}
