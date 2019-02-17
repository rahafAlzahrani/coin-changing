package coin_change;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coin_change {

    
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
        int[] denominations;
        char x;
        System.out.println(" ----welcome to coin change system----");
        
        do{
        System.out.println(" please enter the number of coin denominations: ");
        numOfCoins = input.nextInt();
        denominations = new int[numOfCoins]; 
        System.out.println(" please enter the coin denominations respectively: ");
        
        for(int i=0 ; i < denominations.length ; i++ ){
            denominations[i] = input.nextInt();
        }
        Arrays.sort(denominations);
        System.out.println(" please enter the value that you need to change: ");
        value = input.nextInt();
        
        make_change(denominations,value);
        
            System.out.println(" Do you want to enter another value? [y/n]");
            x = input.next().charAt(0);
        }while(x == 'y');
        
    }
    
}
