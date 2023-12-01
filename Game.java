import java.util.Random;

public class Game {
    Random rand = new Random();
    int totalSticks = rand.nextInt(30) + 1;
    boolean gameOver = false;
    int turn = rand.nextInt(2) + 1;

    public Game(){

    }

    public void startGame(int numPlayers){
        if (numPlayers == 1){
            Player player1 = new Player();
        } else if (numPlayers == 2){
            System.out.println("Player 1:");
            Player player1 = new Player();
            System.out.println("Player 2:");
            Player player2 = new Player();
        } else {
            System.out.println("Please enter a valid player count.");
        }
    }

    public runGame(){
        while (totalSticks > 1){
            if (turn = 1)
        }
    }
}


