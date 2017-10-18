// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    String personPlay;
    String computerPlay;
    int computerInt;
    String winner;
    public void calculate() {
    
        Scanner scan = new Scanner(System.in);
        System.out.print ("Rock, Paper, or Scissors?: ");
        personPlay = scan.next();
        personPlay = personPlay.toUpperCase(); //Determines if person picks rock, paper or scissors
        
        Random generator = new Random();
        computerInt = generator.nextInt(3);
        setComputersPlay(); //Determines computer pick
        
        
        System.out.println("Computer's choice: " + computerPlay);
        System.out.println("Player's choice: " + personPlay);
        
        determineWinner();
        System.out.println("The winner is: " + winner);
    }
    public void setComputersPlay() {
        if(computerInt == 0) {
                computerPlay = "ROCK";
        }
        else if(computerInt == 1) {
                computerPlay = "PAPER";
        }
        else {
                computerPlay = "SCISSORS";
        }
    }
    public void determineWinner() {
       if(computerPlay.equals("ROCK") && personPlay.equals("SCISSORS")) {
           winner = "Computer";
       }
       if(computerPlay.equals("SCISSORS") && personPlay.equals("ROCK")) {
           winner = "Player";
       }
       if(computerPlay.equals("PAPER") && personPlay.equals("ROCK")) {
           winner = "Computer";
       }
       if(computerPlay.equals("ROCK") && personPlay.equals("PAPER")) {
           winner = "Player";
       }
       if(computerPlay.equals("PAPER") && personPlay.equals("SCISSORS")) {
           winner = "Computer";
       }
       if(computerPlay.equals("SCISSORS") && personPlay.equals("PAPER")) {
           winner = "Player";
       }
    }
}