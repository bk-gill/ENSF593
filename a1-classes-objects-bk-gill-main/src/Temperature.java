
/**
 * The class Temperature represents a temperature in Fahrenheit and allows 
 * computation & display of the equivalent temperature in Celsius, 
 * or, displays the value as it is in Fahrenheit.
 * 
 * @author Balkarn Gill 
 * 
 */
public class Temperature {
	/**
	 * The temperature in degrees
	 */
	public double degrees;
	/**
	 * 
	 * @return degrees, in it's default value in Fahrenheit
	 */
	public double getFahrenheit() {
		return degrees;
	}
	/**
	 * 
	 * @return degrees after it has been converted into Celsius
	 */
	public double getCelsius() {
		return (5 *(degrees -32) /9);
	}
	
	// Create 2 Temperature objects and output the temperatures in Fahrenheit and Celsius
	public static void main(String[] args) {
		Temperature thermometer1 = new Temperature();
		Temperature thermometer2 = new Temperature();
		thermometer1.degrees = 20;
		thermometer2.degrees = 98.6;
		
		System.out.print("The temperature of thermometer1 is "); 
		System.out.print(thermometer1.getFahrenheit());
		System.out.println(" degrees Fahrenheit."); 
		
		System.out.print("The temperature of thermometer1 is "); 
		System.out.format("%.2f",thermometer1.getCelsius());
		System.out.println(" degrees Celsius."); 

		System.out.print("The temperature of thermometer2 is "); 
		System.out.print(thermometer2.getFahrenheit());
		System.out.println(" degrees Fahrenheit."); 
		
		System.out.print("The temperature of thermometer2 is "); 
		System.out.print(thermometer2.getCelsius());
		System.out.println(" degrees Celsius."); 

	}

}
