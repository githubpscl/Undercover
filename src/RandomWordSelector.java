
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWordSelector {
    private List<String> words = new ArrayList<>();

    public RandomWordSelector(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRandomWord() {
        if (words.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }
}
