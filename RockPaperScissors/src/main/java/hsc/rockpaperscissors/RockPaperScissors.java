package hsc.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        boolean keepPlaying;
        keepPlaying = false;
        
        do {    
            System.out.println("How many rounds would you like to play? ");
            
            int keepPlayingNumberInput;
            int rounds;
            Scanner inputReader = new Scanner(System.in);

            rounds = Integer.parseInt(inputReader.nextLine());

            while (rounds < 1 || rounds > 10){
                System.out.println("Please input an integer between 1 and 10.");

                rounds = Integer.parseInt(inputReader.nextLine());
            }

            int playerChoice;
            Random rpsGen = new Random();
            
            int ties = 0;
            int computerWins = 0;
            int playerWins = 0;

            for (int i = 0; i < rounds; i++){
                System.out.println("Pick a number for your choice: 1 = Rock, 2 = Paper, 3 = Scissors");
                playerChoice = Integer.parseInt(inputReader.nextLine());
                while (playerChoice != 1 && playerChoice != 2 && playerChoice != 3){
                    System.out.println("Sorry that's not a valid number. Pick a number for your choice: 1 = Rock, 2 = Paper, 3 = Scissors");
                    playerChoice = Integer.parseInt(inputReader.nextLine());
                }
                
                System.out.println("========================\nRound " + (i+1) + ":");
                int computerChoice = rpsGen.nextInt(3) + 1;
                

                if (playerChoice == computerChoice){
                    switch(computerChoice) {
                        case 1:
                            System.out.println("I also chose Rock! It's a tie!\n========================");
                            break;
                        case 2:
                            System.out.println("I also chose Paper! It's a tie!\n========================");
                            break;
                        case 3:
                            System.out.println("I also chose Scissors! It's a tie!\n========================");
                            break;           
                    }
                    ties++;
                } else {

                    switch(playerChoice){
                        case 1:
                            switch(computerChoice) {
                                case 2:
                                    System.out.println("I chose Paper! Paper wraps Rock; I win!\n========================");
                                    computerWins++;
                                    break;
                                case 3:
                                    System.out.println("I chose Scissors! Rock breaks Scissors; you win!\n========================");
                                    playerWins++;
                                    break;
                            }
                            break;
                        case 2:
                            switch(computerChoice) {
                                case 1:
                                    System.out.println("I chose Rock! Paper wraps Rock; you win!\n========================");
                                    playerWins++;
                                    break;
                                case 3:
                                    System.out.println("I chose Scissors! Scissor cuts Paper; I win!\n========================");
                                    computerWins++;
                                    break;
                            }
                            break;
                        case 3:
                            switch(computerChoice) {
                                case 1:
                                    System.out.println("I chose Rock! Rock breaks Scissors; I win!\n========================");
                                    computerWins++;
                                    break;
                                case 2:
                                    System.out.println("I chose Paper! Scissor cuts Paper; you win!\n========================");
                                    playerWins++;
                                    break;
                            } 
                            break;
                    }
                }    
            }

            System.out.println("\nLooks like I won " + computerWins + " times, you won " + playerWins + " times, and we tied " + ties + " times!");
            if (computerWins > playerWins){
                System.out.println("I won overall this time!");
            } else if (playerWins > computerWins){
                System.out.println("You won overall this time!");
            } else {
                System.out.println("It seems we tied overall!");
            }
            
            System.out.println("\nDo you want to keep playing? Enter 1 to keep playing or 2 to stop.");
            keepPlayingNumberInput = Integer.parseInt(inputReader.nextLine());

            while (keepPlayingNumberInput != 1 && keepPlayingNumberInput != 2){
                System.out.println("Please enter 1 to keep playing or 2 to stop.");
                keepPlayingNumberInput = Integer.parseInt(inputReader.nextLine());  
            } 
            
            if (keepPlayingNumberInput == 1){
                keepPlaying = true;
            } else {
                keepPlaying = false;
                System.out.println("\nThanks for playing!");
            }
            
        } while (keepPlaying);      
        
        
    }
}
