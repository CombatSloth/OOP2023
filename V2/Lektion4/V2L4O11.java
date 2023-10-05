/* Övning 11
 * 
 * En enhets eller identitetsmatris är en kvadarisk matris (NxN) 
 * där diagonalen ärett medan alla andra värden är 0
 * 
 * Skriv ett program som fråga efter önskad matrisstorlek 
 * och sedan skriver ut en så stor enhets matris
 */

import java.util.Scanner;
public class V2L4O11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv din matris(1-10): ");
        int N = scanner.nextInt();

        for(int row = 0; row < N; ++row){

            System.out.println(" ");
            
            for (int col =0; col<N; ++col){
                if (row == col) {
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }

        }

        scanner.close();
    
        
    }
}
