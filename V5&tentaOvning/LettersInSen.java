/* Övning 4
 * 
 * Läs in en mening från användaren och sedan en bokstav. 
 * Berätta sedan för användaren hur många gånger den bokstaven förekom i meningen.
 * För att lösa detta behöver du veta att längden på en strän får du med metoden length().
 * 
 */


import java.util.Scanner;

public class LettersInSen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // skriv in mening
        System.out.print("Skriv en mening ");
        String sen = scanner.nextLine();
        
        // Skriv in en bokstav 
        System.out.print("Skriv in en bokstav: ");
        String let = scanner.nextLine();
        char letter = let.charAt(0);

        // Den beräkar först antal bostäver i int typ, i loopar antal gånger som motsvarar längdens tal.
        // Om angiven bokstaven är lika med bokstaven loopen befinner sig i, count ökar med 1.
        int count= 0;
        for (int i= 0; i < sen.length(); ++i){
            if (letter == sen.charAt(i)) count ++;
        }

        scanner.close();
        System.out.println("Meningen innehåller " + count + " stycken " + let);
    }
}
