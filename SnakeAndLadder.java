import java.util.Random;
public class SnakeAndLadder {
    //variables
    int position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        SnakeAndLadder snakeLadder = new SnakeAndLadder();
        snakeLadder.playerOption();
    }

    public int rollDice() {
        Random random = new Random();
        int dice = (random.nextInt(6) + 1);
        System.out.println("Die Roll Is : " + dice);
        return dice;
    }

    public void playerOption() {
        Random random = new Random();
        int dice = rollDice();
        int option = random.nextInt(3);
        System.out.println("Player Option Is : " + option);
        System.out.println("0.No Play 1.Ladder 2.Snake");
        switch (option) {

            case 0:
                System.out.println("No Play");
                break;
            case 1:
                System.out.println("Ladder");
                position +=dice;
                break;
            case 2:
                System.out.println("Snake");
                position -=dice;
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}



