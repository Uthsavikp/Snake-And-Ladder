import java.util.Random;
public class SnakeAndLadder {
    //constants
    final static int WIN_POSITION = 100;
    //variables
    int position = 0;
    int winTime = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        SnakeAndLadder snakeLadder = new SnakeAndLadder();
        snakeLadder.playerOption();
        // snakeLadder.winningPosition();
    }

    public int rollDice() {
        Random random = new Random();
        int dice = (random.nextInt(6) + 1);
        System.out.println("Die Roll Is : " + dice);
        return dice;
    }

    public void playerOption() {
        while (position < WIN_POSITION) {
            Random random = new Random();
            int dice = rollDice();
            int option = random.nextInt(3);
            System.out.println("Player Option Is : " + option);
            switch (option) {

                case 1:
                    System.out.println("Ladder");
                        position += dice;

                    break;
                case 2:
                    System.out.println("Snake");
                    if ((position - dice) < position) {
                        position = position;
                    } else {
                        position -= dice;
                    }
                    break;
                default:
                    System.out.println("No Play");
                    break;
            }
            System.out.println("Winning Position Of Player : " + position);
        }
    }
}





