import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
	
/**
 * SecretWordGUI is the GUI application for guessing a secret word. It uses logic from SecretWord.java.
 * 
 * @author Balkarn Gill 
 *
 */
public class SecretWordGUI implements ActionListener {

    private JTextField inputField;
    private JTextArea display;
    private String inputString;
    private SecretWord secret;

    /**
     * Constructor for SecretWordGUI class.
     * Initializes the GUI and sets up the necessary components.
     *
     */
    public SecretWordGUI(String title) {
        this.secret = new SecretWord();

        // Create the main JFrame
        JFrame jfrm = new JFrame(title);
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500, 250);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a prompt label for user input
        JLabel prompt = new JLabel("Input a single character to guess the secret word (hit ENTER):");
        jfrm.add(prompt);

        // Create and add the input field for guessing
        this.inputField = new JTextField(1);
        this.inputField.setText("");
        this.inputField.addActionListener(this);
        jfrm.add(inputField);

        // Create and add the display area for showing results
        this.display = new JTextArea(10, 30);
        this.display.append("The secret word: " + secret.getDisplayedWord() + "\n");
        jfrm.add(display);

        jfrm.setVisible(true);
    }

    /**
     * actionPerformed method from ActionListener interface.
     * Handles the events when an action is performed, such as pressing ENTER in the input field.
     * 
     */
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == inputField) {
            this.inputString = inputField.getText();
            this.inputField.setText("");
            boolean guess = secret.makeGuess(inputString.charAt(0));

            // Process the user's guess
            if (guess == true)
                this.display.append("That Guess Was Right " + secret.getDisplayedWord() + "\n");
            else
                this.display.append("That Guess Was Wrong " + secret.getDisplayedWord() + "\n");
        }
    }

    /**
     * The main method to start the GUI application.
     *
     */
    public static void main(String[] args) {
        // Starting the GUI application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SecretWordGUI("Guess the secret word");
            }
        });
    }
}