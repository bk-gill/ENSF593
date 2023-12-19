import java.awt.*;
import java .awt. event .*;
import javax.swing.*; 

/**
 * The class MonthGUI represents a graphical user interface application that allows
 * the user to input a month number and then displays the number of days
 * in that specific month.
 * 
 * @author Balkarn Gill 
 *
 */

public class MonthGUI implements ActionListener{
	
	private JTextField inputField; 
	private JTextArea display;
	
	/**
	 * Constructs a MonthGUI object and initializes main frame for the GUI
	 * 
	 * @param title 
	 */

	public MonthGUI(String title)  {
		
		// Create the main frame
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(450, 100 );  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// Add a prompt label
		JLabel prompt = new JLabel("Input a month between 1 and 12 and press return:");
		jfrm.add(prompt);
		
		// Add an input field
		inputField = new JTextField(2); 
		inputField.setText("0");
		inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
		// Add a display area
		display = new JTextArea (1 ,30);
		jfrm.add(display);
		
		// Make the frame visible
		jfrm.setVisible(true);
		
	}
	
	/** 
	 * Handles action events triggered by user actions. If the action event is generated by the input field, 
	 * it retrieves the input from the text field, converts it to an integer, and then displays the number of days
     * for the corresponding month in the display area.
	 * 
	 */
	
	public void actionPerformed(ActionEvent ae)  { 
		if ( ae.getSource() == inputField) { 
			
			String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", 
					"September", "October", "November", "December"};
			
			String input = inputField.getText();
			int number = Integer.parseInt(input); 
			this.display.append("There are " + Days.howManyDaysInMonth(number) + " days in " + months[number-1] + "\n");
			
		}
	}
	
	/**
	 * Starts the application by creating instance of the MonthGUI class
	 * called "Days of Month". 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MonthGUI("Days of Months");
			}
		});

	}

}
