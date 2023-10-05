/* Övning 2
 * 
 * Skriv ett program som låter användaren mata in ett tal som får plats att sparas i en byte.
 * Om användaren matar in ett för stort eller för litet tal skall den få försöka igen.
 * Spara sedan talet i en byte-variabel och skriva ut
 * 
 * en byte = 256 max i signed byte kan representera -128 till 127
 */

import java.util.Scanner; 
public class V2L4HO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ange ett tal: ");
        int tal1 = scanner.nextInt();

        while(true){

            if ( tal1 > Byte.MAX_VALUE){
                 System.out.print("För stor, försök igen: ");
                 tal1 = scanner.nextInt();
                 
            } 
            else if ( tal1 < Byte.MIN_VALUE) {
                System.out.print("För lite, försök igen: ");
                tal1 = scanner.nextInt();
                
            }
            else break;
        }

        scanner.close();
        System.out.println(tal1 + " är godkänd");
        
    }
    
}
