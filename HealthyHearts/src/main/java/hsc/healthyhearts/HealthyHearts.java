package hsc.healthyhearts;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        int age;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = Integer.parseInt(myScanner.nextLine());
        
        int maxHeartRate = 220 - age;
        double lowerBound = 0.5 * maxHeartRate;
        double upperBound = 0.85 * maxHeartRate;
        
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + lowerBound + " - " + upperBound + " beats per minute");
        
    }
}
