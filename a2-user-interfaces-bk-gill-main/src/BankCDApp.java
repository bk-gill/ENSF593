/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit (CD) values.
 *  
 * @author Balkarn Gill 
 *
 */

import java.text.NumberFormat;
import java.util.Locale;



public class BankCDApp {
	

	private BankCD bank;
	private InteractiveCLI cli;
	
	/**
	 * Constructs a BankCDApp object and initializes the CLI.
	 */
	public BankCDApp() {
		
		cli = new InteractiveCLI();
	}
	
	/**
	 * Executes the BankCDApp program by prompting the user to input the 
	 * principle amount, interest rate, and duration in years, after which 
	 * it displays the resulting maturity value.
	 */
	public void run() {
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
		NumberFormat percentageFormatter = NumberFormat.getPercentInstance(Locale.CANADA);
		percentageFormatter.setMaximumFractionDigits(4);

		double principal;
		double rate;
		double years;
		
		
		System.out.println("************************ OUTPUT ********************");
		System.out.println("Compare daily and annual compounding for a Bank CD.");

		// Prompts user input of initial principle
		this.cli.prompt(" Input CD initial principal, e.g.  1000.55: ");
		principal = this.cli.getKeyboardDouble();

		// Prompts user input of interest rate
		this.cli.prompt(" Input CD interest rate, e.g.  6.5: ");
		rate = this.cli.getKeyboardDouble();
		
		// Prompts user input of duration in years
		this.cli.prompt(" Input the number of years to maturity, e.g., 10.5: ");
		years = this.cli.getKeyboardDouble();

		// Displays the details entered by user
		this.cli.display(("For Principal = "+currencyFormatter.format(principal)+" Rate = " + percentageFormatter.format(rate/100) + " Years = " + years));
		
		// Create a BankCD object with the user inputs
		BankCD bank = new BankCD(principal,rate,years);
		
		// Compute and display the maturity value compounded yearly
		this.cli.display((" The maturity value compounded yearly is: " + currencyFormatter.format(bank.calcYearly())));
		
		// Compute and display the maturity value compounded daily
		this.cli.display((" The maturity value compounded daily is: " + currencyFormatter.format(bank.calcDaily())));
		
		System.out.println("************************ OUTPUT ********************");
		
	}

	
	/**
	 * Starting point of the program's execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankCDApp app = new BankCDApp();
		app.run();

	}

}
