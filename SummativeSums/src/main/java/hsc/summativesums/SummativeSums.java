package hsc.summativesums;

public class SummativeSums {
    public static int sum(int[] things) {
        int sum = 0;
        for (int i = 0; i < things.length; i++){
            sum = sum + things[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int thingOne[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int thingTwo[] = { 999, -60, -77, 14, 160, 301 };
        int thingThree[] =  { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };        
        
        System.out.println("#1 Array Sum: " + sum(thingOne));
        System.out.println("#2 Array Sum: " + sum(thingTwo));
        System.out.println("#3 Array Sum: " + sum(thingThree));
    }
}
