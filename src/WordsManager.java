
import java.util.ArrayList;

public class WordsManager {
    RandomWordSelector wordSelector = new RandomWordSelector("woerter.txt");
    String word = wordSelector.getRandomWord();
    ArrayList<String> words = new ArrayList<>();

    String getWord() {
        return word;
    }

    ArrayList<String> getWordList() {
        return words;
    }
}
