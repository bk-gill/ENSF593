/**
 * NewtonApp is a class that represents an interactive command-line application for approximating the square root of a number using Newton's method.
 * The class utilizes the InteractiveCLI class to interact with the user and the NewtonSolver class to perform the square root approximation.
 * This class contains a main method to run the application.
 *
 * @author Balkarn Gill
 */
public class NewtonApp {
    private InteractiveCLI cli; // Instance variable to handle command-line interactions.
    private NewtonSolver solver; // Instance variable to perform square root approximation.

    /**
     * Constructor for NewtonApp class.
     * Initializes the InteractiveCLI and NewtonSolver objects.
     */
    public NewtonApp() {
        cli = new InteractiveCLI(); // Initialize the InteractiveCLI object.
        
    }

    /**
     * The run method executes the interactive application.
     * It prompts the user to enter a number, maximum error, and initial guess.
     * It then uses the NewtonSolver to approximate the square root and displays the result.
     */
    public void run() {
    	
        this.cli.prompt("Enter a real positive number: "); // Prompt the user to enter a number.
        double number = this.cli.getKeyboardDouble(); // Read the number entered by the user.

        this.cli.prompt("Enter the maximum error (real, positive number): "); // Prompt the user to enter the maximum error.
        double maxError = this.cli.getKeyboardDouble(); // Read the maximum error entered by the user.

        this.cli.prompt("Enter your initial guess (real, positive number): "); // Prompt the user to enter the initial guess.
        double initialGuess = this.cli.getKeyboardDouble(); // Read the initial guess entered by the user.

        solver = new NewtonSolver(number, maxError, initialGuess); // Initialize the NewtonSolver object.
        double squareRoot = solver.sqrt(); // Approximate the square root using NewtonSolver.
        int iterations = solver.getIterationCount(); // Get the number of iterations performed.

        cli.display("Square root: " + squareRoot); // Display the approximated square root.
        cli.display("Number of iterations: " + iterations); // Display the number of iterations performed.
    }

    /**
     * The main method is the entry point of the application.
     * It creates an instance of NewtonApp and runs the application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        NewtonApp app = new NewtonApp(); // Create an instance of NewtonApp.
        app.run(); // Run the application.
    }
}