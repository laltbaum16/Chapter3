import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
          int computer;
          int numberOfGuesses = 0;
          int numberTooHigh = 0;
          int numberTooLow = 0;
          
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          computer = generator.nextInt(11);
          //print message asking user to enter a guess
          System.out.println("Guess a number between 0-10");
          //read in guess
          guess = scan.nextInt();          
          while (computer != guess)  //keep going as long as the guess is wrong
           {
                  if(guess > computer) {
                      System.out.println("You guessed too high!");
                      numberTooHigh += 1;
                      numberOfGuesses += 1;
                  }
                  if(guess < computer) {
                      System.out.println("You guessed too low!");
                      numberTooLow += 1;
                      numberOfGuesses += 1;
                  }
                  System.out.println("You guessed wrong!");
                  guess = scan.nextInt();
          }
          System.out.println("You guessed correctly! It took you " + numberOfGuesses + " tries");
          System.out.println(numberTooHigh + " number of guesses too high!");
          System.out.println(numberTooLow + " number of guesses too low!");
        }
}