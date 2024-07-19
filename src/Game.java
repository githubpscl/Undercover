import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<String> words = new ArrayList<>(); // changed to ArrayList<String>
    WordsManager wordsManager = new WordsManager();
    Scanner scanner = new Scanner(System.in);
    int numberOfImp = 1;

    public void createPlayers() {
        while (true) {
            System.out.println("Bitte geben Sie Ihren Namen ein:");
            String name = scanner.nextLine(); // Speichert die Eingabe als String
            if (name.isEmpty()) {
                break;
            }
            Player player = new Player(name, false);
            players.add(player);
        }
    }

    public boolean getRole(Player player) {
        return false;
    }

    public String getWord() {
        return wordsManager.getWord();
    }

    public ArrayList<Player> getPlayerList() {
        return players;
    }

    // Example method to add words to the words list
    public void addWord(String word) {
        words.add(word);
    }

    public void assignMrWhite() {
        if (numberOfImp > players.size()) {
            System.out.println("Number of Mr. Whites cannot be more than the number of players.");
            return;
        }
    
        Random random = new Random();
        int remainingMrWhites = numberOfImp;
        int remainingPlayers = players.size();
    
        for (Player player : players) {
            double probability = (double) remainingMrWhites / remainingPlayers;
            if (random.nextDouble() <= probability) {
                player.setMrWhite(true);
                remainingMrWhites--;
            }
            remainingPlayers--;
            if (remainingMrWhites == 0) {
                break;
            }
        }
    }
    

    public void showWord(Player player){
        System.out.println("Bitte irgendwas drücken");
        String space = scanner.nextLine();
        if(player.isMrWhite()){
            System.out.println("You are Mr. White");
        }
        else{
            System.out.println(wordsManager.getWord());
        }
        System.out.println("Bitte irgendwas drücken");
        space = scanner.nextLine();
        clearConsole();
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing the console: " + e.getMessage());
        }
    }

}
