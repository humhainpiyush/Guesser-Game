import java.util.Scanner;

class Guesser
{
    int guesserNum;
    
    public int guesserGuess()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser: \nGuess a number: ");
        guesserNum = scan.nextInt();

        return guesserNum;
    }
}

class Player
{
    int playerNum;

    public int playerGuess()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player: \nGuess a number: ");
        playerNum = scan.nextInt();

        return playerNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void takeFromGuesser()
    {
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.guesserGuess();
    }

    void takeFromPlayer()
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        numFromPlayer1 = player1.playerGuess();
        numFromPlayer2 = player2.playerGuess();
        numFromPlayer3 = player3.playerGuess();
    }

    void compare()
    {
        if(numFromPlayer1 == numFromGuesser)
        {
            if(numFromPlayer2 == numFromGuesser && numFromPlayer3 == numFromGuesser)
            {
                System.out.println("All the players won the game");
            }
            else if(numFromPlayer2 == numFromGuesser)
            {
                System.out.println("Only player1 and player2 won the game");
            }
            else if(numFromPlayer3 == numFromGuesser)
            {
                System.out.println("Only player1 and player3 won the game");
            }
            else
            {
                System.out.println("Only player1 won the game");
            }
        }
        else if(numFromPlayer2 == numFromGuesser)
        {
            if(numFromPlayer3 == numFromGuesser)
            {
                System.out.println("Only player2 and player3 won the game");
            }
            else
            {
                System.out.println("Only player2 won the game");
            }
        }
        else if(numFromPlayer3 == numFromGuesser)
        {
            System.out.println("Only player3 won the game");
        }
        else
        {
            System.out.println("No player won the game");
        }
    }

}



public class GuesserGameProject {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.takeFromGuesser();
        u.takeFromPlayer();
        u.compare();
    }
}
