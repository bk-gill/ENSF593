/**
 * The BankCD class models a bank certificate of deposit (CD) with a specific principal amount,
 * interest rate, and duration in years. It offers methods to compute the maturity value of the CD
 * using either yearly compounding or daily compounding.
 * 
 * @author Balkarn Gill 
 *
 */
public class BankCD {

	double principal;
	double rate;
	double years;
	
	/**
	 * Constructs a BankCD object with the specific principle amount, interest rate, and duration in years
	 * 
	 * @param principle 
	 * @param rate
	 * @param years
	 */
	
	public BankCD(double principle, double rate, double years) {
		
		this.principal = principle;
		this.rate = rate;
		this.years = years;
	}


	/**
	 * Calculates the maturity value of the CD with yearly compounding
	 * @return maturity value of the CD 
	 */
	public double calcYearly() {
		return ((this.principal * Math.pow(1 + this.rate/100, this.years)) );
		
	}
	
	/**
	 * Calculates the maturity value of the CD with daily compounding
	 * @return
	 */
	public double calcDaily() {
		return (this.principal * Math.pow(1 + this.rate/36500, this.years*365));
		
	}
		
	
}
	
