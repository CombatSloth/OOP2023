/* Övning 5
 * 
 * Skriv ett program där användaren får mata in ett tal. 
 * Programmet skall skriva då ut " Hej" x3 som talet.
 */

import java.util.Scanner; 
public class V2L405 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("Skriv ett tal: ");
        int tal = scanner.nextInt();

        for (int i = 0; i < tal *3; ++i) System.out.print("Hej" + " ");


        scanner.close();
    
    }
    
}
