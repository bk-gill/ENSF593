
/**
 * 
 * TODO: The Days class provides static methods to calculate the number of days in a given month.
 * 
 * @author Balkarn Gill 
 *
 */
public final class Days {
	
	/**
	 * Days cannot be instantiated, has static methods only.
	 */
	private Days() {}

	public static int howManyDaysInMonth(int number){
		
		// If input is 0, return 0
		if (number == 0) {
			return 0;
		}
		
		// If input is 2, return 28 for month of February
		else if (number == 2) {
			return 28;
		}
		
		// If input is 8, return 31 days for month of August
		else if (number == 8) {
			return 31;
		}
		// For all months before August (excluding February) , even numbered months will have 30 days and odd months will have 31 days
		else if (number < 8 & number > 0) {
			if (number % 2 == 0) {
				return 30;
			}
			else {
				return 31;
			}
		}
		// For all months after August, even numbered months will have 31 days and odd months will have 30 days
		else if (number > 7 & number < 13) {
			if (number % 2 == 0) {
				return 31;
			}
			else {
				return 30;
			}
		}
		else {
			return 0;
		}
	}

}
		
		
		
		
		
		
		
		
//		int days = 0;
//		
//		
//
//		if (number == 0) {
//			days = 0;
//		}
//		
//
//		
//		
//		
//		else if (number ==7) {
//			days = 31;
//		}
//		
//		else if (number < 7) {
//			if (number == 2) {
//				days = 28;
//			}
//			else if (number % 2 == 0) {
//				days = 30;
//			}
//			else {
//				days = 31;
//			}
//		}	
//		else if (number >= 7) {
//			if (number % 2 == 0) {
//				days =  31;
//			}
//			else {
//				days = 30;
//			}
//		}
//		return days;
//	}
//}
