/**
 * This class represents a collection of grades, and provides methods for adding grades,
 * calculating the mean and median of the grades, and for sorting and displaying the grades.
 */
public class Stats {
    private int[] grades; // Array to store the grades
    private int count;    // Keeps track of the number of grades added

    /**
     * Default constructor that initializes an empty array of grades and sets count to 0.
     */
    public Stats() {
        grades = new int[100];
        count = 0;
    }

    /**
     * Adds a grade to the array and increments the count.
     *
     * @param grade the grade to be added.
     */
    public void add(int grade) {
        grades[count] = grade;
        count++;
    }

    /**
     * Calculates the mean of the grades.
     *
     * @return the mean of the grades. Returns 0.0 if there are no grades.
     */
    public double getMean() {
        if (count == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return (double) sum / count;
    }

    /**
     * Sorts the array of grades in ascending order using the Bubble Sort algorithm.
     */
    public void sort() {
        int n = count;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (grades[j] > grades[j + 1]) {
                    // Swap grades[j] and grades[j+1]
                    temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Calculates the median of the grades.
     *
     * @return the median of the grades. Returns 0.0 if there are no grades.
     */
    public double getMedian() {
        sort();
        if (count == 0) {
            return 0.0;
        }

        int middleIndex = count / 2;
        if (count % 2 == 0) {
            // Even number of grades, return the average of the two middle values
            int middleValue1 = grades[middleIndex - 1];
            int middleValue2 = grades[middleIndex];
            return (double) (middleValue1 + middleValue2) / 2;
        } else {
            // Odd number of grades, return the middle value
            return grades[middleIndex];
        }
    }

    /**
     * Returns a string representation of the grades, the mean, and the median.
     *
     * @return a string representation of the grades, the mean, and the median.
     */
    public String toString() {
        sort();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(grades[i]);
            if (i < count - 1) {
                sb.append(" ");
            }
        }

        double mean = getMean();
        double median = getMedian();

        sb.append("\n");
        sb.append("Mean: ").append(mean);
        sb.append("\n");
        sb.append("Median: ").append(median);

        return sb.toString();
    }
}
