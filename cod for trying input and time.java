package coinchangingcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coinchangingcode {

    
    static void make_change(int[] coins, int value ){
        
        ArrayList<Integer> optimal_solution = new ArrayList<>();
        
        int result =0;
        int y= value;
        while (value != 0) {
            for (int i=coins.length - 1 ; i>=0 ; i--) {
                if (coins[i] <= value) {
                    value = value - coins[i];
                    optimal_solution.add(coins[i]);                
                    i++; 
                    result++;
                }
            }
        }
        System.out.println(" for the value " + y + " you will need " + result + " coins.");
        System.out.println(" these coins are: " + optimal_solution);
              
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        int numOfCoins ;
        int value;
        int[] denominations = {1,3,5,10,30,50};
        char x;
        System.out.println(" ----welcome to coin change system----");
        
        value = 56699555;
        
        make_change(denominations,value);        
    }
    
}
