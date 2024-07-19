public class Main{



    public static void main(String[] args) {

        Game game = new Game();

        game.createPlayers();

        game.assignMrWhite();

        for (Player player : game.getPlayerList()) {
            System.out.println(player);
            if(player.mrWhite){
                //System.out.println("MrWhite");
            }
        }

        for (Player player : game.getPlayerList()) {
            game.showWord(player);

        }

        
    }


}