/**
 * The TextAnalyzer class analyzes a given text and counts the number of sentences and words in it.
 * 
 * @author Balkarn Gill 
 * 
 */
public class TextAnalyzer {
    private int numOfSentences;
    private int numOfWords;

    /**
     * Constructs a TextAnalyzer object to analyze the given text.
     *
     * @param text the text to be analyzed
     */
    public TextAnalyzer(String text) {
        String trimmedText = text.trim();

        // Count the sentences only if the sentence ends with a punctuation (.!?)
        numOfSentences = 0;
        boolean sentenceEnd = true;

        for (int i = 1; i < trimmedText.length(); i++) {
            char c = trimmedText.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                if (sentenceEnd) {
                    numOfSentences++;
                    sentenceEnd = false;
                }
            } else {
                sentenceEnd = true;
            }
        }

        // Count the words
        this.numOfWords = trimmedText.isEmpty() ? 0 : trimmedText.split("\\s+").length;
    }

    /**
     * Returns the number of sentences in the analyzed text.
     *
     * @return the number of sentences
     */
    public int getNumOfSentences() {
        return numOfSentences;
    }

    /**
     * Returns the number of words in the analyzed text.
     *
     * @return the number of words
     */
    public int getNumOfWords() {
        return numOfWords;
    }

    @Override
    public String toString() {
        return "The text contains " + numOfSentences + " sentences and " + numOfWords + " words.";
    }
}
