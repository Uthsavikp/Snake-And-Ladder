import java.util.Random;
public class SnakeAndLadder {
    //variables
    int position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        SnakeAndLadder snakeLadder = new SnakeAndLadder();
        snakeLadder.rollDice();
    }
    public int rollDice() {
        Random random = new Random();
        int dice = (random.nextInt(6)+1);
        System.out.println("Die Roll Is : " + dice);
        return dice;
        }
    }


