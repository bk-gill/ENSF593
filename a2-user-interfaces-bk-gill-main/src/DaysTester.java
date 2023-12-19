
/**
 * A class to test the Days class.
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * 
 * @author Balkarn Gill 
 *
 */

public class DaysTester {

	public static void main(String[] args) {
		
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", 
							"September", "October", "November", "December"};
		
		for (int i = 1; i < 13; i++) {
			
			System.out.print("In " + (months[i-1]) + " there are " + Days.howManyDaysInMonth(i) + " days." + "\n");
			
			}
			
			}
	

}
