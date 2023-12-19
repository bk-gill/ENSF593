/**
 * Represents a series of data values along with basic statistics.
 * 
 * @author Balkarn Gill
 * 
 */

public class DataSeries implements IBasicStats {
    private String label;
    private double[] data;
    private int count;

    /**
     * Constructs a DataSeries object with the specified label.
     *
     * @param label the label for the data series
     */
    public DataSeries(String label) {
        this.label = label;
        this.data = new double[100];
        this.count = 0;
    }

    /**
     * Adds a value to the data series.
     *
     * @param value the value to be added
     */
    public void add(double value) {
        if (count < data.length) {
            data[count++] = value;
        }
    }

    /**
     * Returns the size of the data series.
     *
     * @return the size of the data series
     */
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(label).append(": ");
        for (int i = 0; i < count; i++) {
            sb.append(data[i]);
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public double getMin() {
        if (count == 0) {
            return 0.0;
        }
        double min = data[0];
        for (int i = 1; i < count; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    @Override
    public double getMax() {
        if (count == 0) {
            return 0.0;
        }
        double max = data[0];
        for (int i = 1; i < count; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    @Override
    public double getSum() {
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += data[i];
        }
        return sum;
    }

    @Override
    public double getMean() {
        if (count == 0) {
            return 0.0;
        }
        double sum = getSum();
        return sum / count;
    }
}
