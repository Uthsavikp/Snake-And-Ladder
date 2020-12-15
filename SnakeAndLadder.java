import java.util.Random;
public class SnakeAndLadder {
    //constants
    final static int WIN_POSITION = 100;
    //variables
    int position = 0;
    int positionCheck = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        SnakeAndLadder snakeLadder = new SnakeAndLadder();
        snakeLadder.playerOption();
    }

    public int rollDice() {
        Random random = new Random();
        int dice = (random.nextInt(6) + 1);
        System.out.println("_____________________");
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
                    if ((position + dice) > WIN_POSITION) {
                        position = WIN_POSITION;
                    } else {
                        position += dice;
                    }
                    System.out.println("Ladder Is At : " + position);
                    break;
                case 2:
                    position -= dice;
                    if ((position - dice) < positionCheck) {
                        position = positionCheck;
                    }
                    System.out.println("Snake Is At : " + position);
                    break;
                default:
                    System.out.println("No Play : " + position);
                    break;
            }
        }
        System.out.println("Winning Position Is : " + position);
    }
}





