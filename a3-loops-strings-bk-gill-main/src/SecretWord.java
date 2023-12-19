 /**
 * SecretWord is a class that represents a word guessing game.
 * It keeps track of a secret word and a displayed word, where each character of the secret word is initially hidden.
 * The class provides methods to retrieve the displayed word, secret word, and make guesses to reveal characters in the displayed word.
 * 
 * @author Balkarn Gill 
 *
 */
public class SecretWord {
	
    private String secretWord; // Stores the secret word.
    private String displayedWord; // Stores the displayed word with hidden characters.

    /**
     * Constructor for the SecretWord class.
     * Initializes the secret word and sets the displayed word with hidden characters represented by asterisks (*).
     */									
    public SecretWord() {
    	
        secretWord = "hello"; // Set the secret word to "hello".
        displayedWord = replaceChars(secretWord, '*'); // Initialize the displayed word with hidden characters.
    }

    /**
     * Retrieves the current state of the displayed word.
     *
     * @return The displayed word.
     */
    public String getDisplayedWord() {
    	
        return displayedWord;
    }

    /**
     * Retrieves the secret word.
     *
     * @return The secret word.
     */
    public String getSecretWord() {
    	
        return secretWord;
    }

    /**
     * Replaces all characters in a string with a specified character.
     *
     * @param str The input string.
     * @param ch  The character to replace with.
     * @return    The new string with replaced characters.
     */
    private String replaceChars(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += ch; // Concatenate the specified character to the result string for each character in the input string.
        }

        return result;
    }

    /**
     * Replaces specific characters in a string with a specified character.
     *
     * @param s1 The input string.
     * @param s2 The string to modify.
     * @param ch The character to replace with.
     * @return   The modified string.
     */
    private String replaceChars(String s1, String s2, char ch) {
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch) {
                result += ch; // Concatenate the specified character to the result string if the condition is met.
            } else {
                result += s2.charAt(i); // Concatenate the character from the second string if the condition is not met.
            }
        }

        return result;
    }

    /**
     * Makes a guess in the word game based on a character input.
     * Reveals the corresponding characters in the displayed word if the guess is correct.
     * Returns true if the guess is correct, indicating that the character was found in the secret word.
     * Returns false if the guess is incorrect, indicating that the character was not found.
     *
     * @param ch The guessed character.
     * @return   True if the guess is correct, false otherwise.
     */
    public boolean makeGuess(char ch) {
    	
        if (secretWord.contains(String.valueOf(ch))) {
            displayedWord = replaceChars(secretWord, displayedWord, ch); // Replace the characters in the displayed word with the guessed character.
            return true; // Indicates a correct guess.
        }

        return false; // Indicates an incorrect guess.
    }
}
