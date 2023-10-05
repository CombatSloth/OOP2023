/* Övning 4
 * 
 * Skriv ett program där användaren får mata in tal tills användaren matar in en nolla. 
 *  Programet ska visa summan av alla de inmatade talen
 * 
 * 
 */


import java.util.Scanner;
public class V2L4O4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tal;
        int sum = 0;

        while (true){
        System.out.print("Skriv ett tal: ");
        tal = scanner.nextInt();

        sum += tal;                           //shorthand assignment.
        if (tal == 0) break;
        }

         
         System.out.println("Summman av alla tal blir: " + sum);

         scanner.close();

    }
}
