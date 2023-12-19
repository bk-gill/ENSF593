/**
 * NewtonSolver is a class that provides a method for approximating the square root of a number using the Newton's method.
 * The class keeps track of the number of iterations performed during the approximation process.
 */
class NewtonSolver {
	
    private int iterationCount; // Private variable to store the iteration count.
    public double number;
    public double maxError;
    public double initialGuess;
    
    /**
     * Constructs a NewtonSolver object with the specific number, maximum error allowed, and the initial guess
     * @param n
     * @param m
     * @param i
     */
	public NewtonSolver(double n, double m, double i) {
		
		this.number = n;
		this.maxError = m;
		this.initialGuess = i;
	}
	
    /**
     * sqrt is a method that takes a number, a maximum error, and an initial guess and returns the approximated square root of the number.
     * The method uses Newton's method to iteratively improve the guess until the error is within the maximum error threshold.
     * It updates the iterationCount variable with the number of iterations performed.
     *
     * @param number        The number for which the square root is to be approximated.
     * @param maxError      The maximum error allowed for the approximation.
     * @param initialGuess  The initial guess for the square root.
     * @return              The approximated square root of the number.
     */
    public double sqrt() {
        double guess = initialGuess; // Initialize the guess with the initial guess.
        double errorDiff = maxError; // Initialize the error difference with the maximum error.

        while (errorDiff >= maxError) { // Perform iterations until the error difference is within the maximum error threshold.
            double newGuess = ((number / guess) + guess) / 2; // Calculate a new guess using Newton's method.
            errorDiff = Math.abs(guess - newGuess); // Calculate the difference between the current guess and the new guess.
            guess = newGuess; // Update the guess with the new guess.
            iterationCount++; // Increment the iteration count.
        }

        return guess; // Return the final approximated square root.
    }

    /**
     * getIterationCount is a method that returns the number of iterations performed during the sqrt method.
     *
     * @return  The number of iterations performed.
     */
    public int getIterationCount() {
        return iterationCount; // Return the iteration count.
    }
}