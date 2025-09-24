package myPrograms.games;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class GuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuessingGame
{
    
    /**
     * Constructor for objects of class GuessingGame
     */
    public GuessingGame()
    {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        System.out.println("Random Number Generated is : " + numberToGuess);
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;
        boolean correctGuess = false;
        while(!correctGuess)
        {
            System.out.println("Guess a number between 0 and 99:");
            int guess = scanner.nextInt();
            numberOfTries++;
            if(guess == numberToGuess)
            {
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                correctGuess = true;
            }
            else if (guess < numberToGuess) { System.out.println("Too Low"); }
            else { System.out.println("Too High"); } 
        }
    }

 
}
