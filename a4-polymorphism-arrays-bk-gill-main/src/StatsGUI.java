import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class provides a partial implementation of a GUI for statistical calculations
 * on a set of grades.
 * It allows for adding new grades, displaying statistics and resetting the data.
 *
 * @author Balkarn Gill 
 */
public class StatsGUI implements ActionListener {
    private JTextField inputField;
    private JTextArea display;
    private JButton reset, displayStats;
    private Stats stats;

    /**
     * Constructs a StatsGUI object with the specified title.
     * Initializes the GUI components and adds them to the JFrame.
     *
     * @param title the title for the JFrame.
     */
    public StatsGUI(String title) { 
        // Instantiate Stats object
        stats = new Stats();
        
        // Set up the JFrame
        JFrame jfrm = new JFrame(title);
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 200);  
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Prompt label
        JLabel prompt = new JLabel("Next Grade (press ENTER)");
        jfrm.add(prompt);
        
        // Text field for grade input
        this.inputField = new JTextField(4); 
        this.inputField.setText("");
        this.inputField.addActionListener(this); 
        jfrm.add(inputField);
        
        // Text area for displaying grades and stats
        this.display = new JTextArea (5 ,20);
        jfrm.add(display);
        
        // Button for displaying stats
        displayStats = new JButton("STATS");
        displayStats.addActionListener(this);
        jfrm.add(displayStats);

        // Button for resetting the data
        reset = new JButton("RESET");
        reset.addActionListener(this);
        jfrm.add(reset);
        
        jfrm.setVisible(true);	
    }

    /**
     * This method is called when an action event occurs.
     * It adds grades, displays stats, and resets the data depending on which GUI component
     * triggered the event.
     *
     * @param e the action event that occurred.
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputField) {
            // Parse the entered grade and add it to stats
            int number = Integer.parseInt(inputField.getText());
            stats.add(number);
            inputField.setText("");
            display.append(number + " "); // Append the entered grade to the display
        } else if (e.getSource() == displayStats) {
            // Display the statistics
            String result = stats.toString();
            display.setText(result);
        } else if (e.getSource() == reset) {
            // Reset the data
            stats = new Stats();
            display.setText("");
            inputField.setText("");
        }
    }

    /**
     * The main method that creates a StatsGUI object.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StatsGUI("Grades statistics");
            }
        });
    }
}
