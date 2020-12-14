public class SnakeAndLadder {
    //variables
    int position=0;
    public static void main(String[] args){
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Die Roll Is : " + getRandomDie(6,1));

    }
    public static int getRandomDie(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

}
