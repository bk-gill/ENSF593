
/**
 * The class Tile represents a character and integer value and allows 
 * for computation of the combined string value and then to check if different objects of 
 * the class are equivalent.
 * 
 * @author Balkarn Gill 
 *
 */


public class Tile {

	public char letter = 'A';
	public int value = 1; 

	public Tile(char l, int v){
		this.letter = l;
		this.value = v;
	}
	
	/**
	 * Combines the character and integer value into a string and assigns the output to 
	 */
	public String toString(){
		String outputString = Character.toString(this.letter) + "[" + this.value + "]";
		
		return outputString;
	}
	
	/**
	 * 
	 * @param x
	 * @return True if both the letter and integer values are equal, False if one or more are unequal
	 */
	public boolean equals(Tile x){
		if (this.letter == x.letter && this.value == x.value) {
			
			return true;
			
		} else {
			
			return false;
		}

	}
	// Create 3 new Tile objects and compares them
	public static void main(String[] args) {
		Tile tile0 = new Tile('A',1);
		Tile tile1 = new Tile('A',1);
		Tile tile2 = new Tile('Z',10);
	
		System.out.println("Tile 0: " + tile0.toString());
		System.out.println("Tile 1: " + tile1.toString());
		System.out.println("Tile 2: " + tile2.toString());
		
		System.out.println("Tile 0 is equal to Tile 1 is " + tile0.equals(tile1));
		System.out.println("Tile 0 is equal to Tile 2 is " + tile0.equals(tile2));

	}

}

