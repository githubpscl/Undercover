import java.io.FileWriter;
import java.io.IOException;

public class WordFileWriter {
    public static void main(String[] args) {
        String[] words = {
                "Apfel", "Haus", "Katze", "Hund", "Baum", "Auto", "Tisch", "Stuhl", "Blume", "Fisch",
                "Vogel", "Buch", "Kind", "Freund", "Schule", "Essen", "Wasser", "Licht", "Lampe", "Ball",
                "Uhr", "Bett", "Schuhe", "Sonne", "Mond", "Stern", "Schnee", "Regen", "Wolke", "Wind",
                "Meer", "Fluss", "Berg", "Wald", "Straße", "Stadt", "Dorf", "Brücke", "Garten", "Park",
                "Platz", "Markt", "Laden", "Fenster", "Tür", "Spiegel", "Bild", "Decke", "Kissen", "Tisch"
        };

        try (FileWriter writer = new FileWriter("woerter.txt")) {
            for (String word : words) {
                writer.write(word + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
