package hsc.doggenetics;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        String dogName; 
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your dog's name? ");
        dogName = myScanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        
        Random dogRNG = new Random();
        
        int totalDNA = 100;
        
        System.out.println("\n" + dogName + " is:\n");
        String[] dogNames = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        
        for (int i = 0; i <4; i++){
            int randomDNA = dogRNG.nextInt(totalDNA) + 1;
            System.out.println(randomDNA + "% " + dogNames[i]);
            totalDNA = totalDNA - randomDNA;    
        }
         
        System.out.println(totalDNA + "% " + dogNames[4]);
                
        System.out.println("\nWow, thats QUITE the dog!");       
    }
}
