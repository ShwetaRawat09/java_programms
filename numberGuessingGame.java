import java.util.Scanner;
import java.util.Random;
public class numberGuessingGame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        //while loop  to determine if  we'll play game agin
       while(play.equals("yes"))
       {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);
       int guess = -1;
       int tries = 0;

        // while loop to check the game is over
        while(guess != randNumber)
        {
         System.out.println("Guess a number between 1 and 100:");
         guess = sc.nextInt();
         tries++;
         if(guess == randNumber)
         {
            System.out.println("woow! you guessed the  number");
            System.out.println(" It ony took you " + tries + " guesses");
            System.out.println("would you like to play again? Yes or No: ");
            play = sc.next().toLowerCase();

         }
         else if(guess > randNumber)
         {
            System.out.println("your guess is too high, try again");
         }
         else
         {
            System.out.println("your guess is too low, try again");
         }

        }

       }
       
       sc.close(); 
    }
}