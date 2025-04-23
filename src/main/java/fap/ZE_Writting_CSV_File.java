package fap;

import java.io.FileWriter;
import java.io.IOException;

public class ZE_Writting_CSV_File {
    public static void main(String[] args) {
        String csvFilePath = "C://Users/sgrch/OneDrive/Desktop/example.csv";

        // Sample data
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
            {"John Doe", "30", "New York"},
            {"Jane Smith", "25", "Los Angeles"},
            {"David Brown", "40", "Chicago"}
        };

        try {
            FileWriter csvWriter = new FileWriter(csvFilePath);

            // Write headers
            for (int i = 0; i < headers.length; i++) {
                csvWriter.append(headers[i]);
                if (i < headers.length - 1) {
                    csvWriter.append(",");
                }
            }
            csvWriter.append("\n");

            // Write data
            for (String[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    csvWriter.append(row[i]);
                    if (i < row.length - 1) {
                        csvWriter.append(",");
                    }
                }
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
            System.out.println("CSV file has been created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
