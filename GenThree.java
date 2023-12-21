/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class Gen3 {
    public static void main(String[] args) {
    
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int min = Math.min(a,b);
    int max = Math.max(a,b);
    int i = 0;
    int min1 = max;

        for (int j = 0; j < 3; j++){
        int ran1 = (int)(Math.random()*(max - min + 1));
        int ran2 = ran1 + min;
        System.out.println(ran2);
            if (ran2 < min1){
            min1 = ran2;}
            }
        
    System.out.println("The minimal generated number was "+ min1);
   
    }
}

