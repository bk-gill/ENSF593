/**
 * Represents a DataFrame that stores tabular data loaded from a CSV file.
 * 
 * @author Balkarn Gill
 * 
 */

import java.io.*;
import java.util.*;

public class DataFrame {
    private String[] headerNames;
    private double[][] data;
    private int numOfRows;
    private int numOfCols;

    /**
     * Constructs a DataFrame object by reading data from a CSV file.
     *
     * @param fileName the name of the CSV file
     * @throws IOException if there is an error reading the file
     */
    public DataFrame(String fileName) throws IOException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            headerNames = scanner.nextLine().split(",");
            numOfCols = headerNames.length;
            data = new double[100][numOfCols];

            while (scanner.hasNextLine() && numOfRows < 100) {
                String[] line = scanner.nextLine().split(",");
                for (int i = 0; i < numOfCols; i++) {
                    data[numOfRows][i] = Double.parseDouble(line[i]);
                }
                numOfRows++;
            }
        }
    }

    /**
     * Returns the header names of the columns in the DataFrame.
     *
     * @return an array of header names
     */
    public String[] getHeaderNames() {
        return headerNames;
    }

    /**
     * Returns the number of rows in the DataFrame.
     *
     * @return the number of rows
     */
    public int getNumOfRows() {
        return numOfRows;
    }

    /**
     * Returns the number of columns in the DataFrame.
     *
     * @return the number of columns
     */
    public int getNumOfCols() {
        return numOfCols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.join(", ", headerNames)).append("\n");
        for (int i = 0; i < Math.min(10, numOfRows); i++) {
            for (int j = 0; j < numOfCols; j++) {
                sb.append(data[i][j]).append(", ");
            }
            sb.setLength(sb.length() - 2);  // Remove the trailing comma and space
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Retrieves a specific column from the DataFrame based on the column index.
     *
     * @param index the index of the column
     * @return a DataSeries representing the column
     */
    public DataSeries getColumnByIndex(int index) {
        DataSeries column = new DataSeries(headerNames[index]);
        for (int i = 0; i < numOfRows; i++) {
            column.add(data[i][index]);
        }
        return column;
    }
}
