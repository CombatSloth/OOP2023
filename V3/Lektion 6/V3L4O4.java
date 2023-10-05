/* Övning 4
 * 
 * Skapa en klass Person som innehåller förnamn, efternamn och ålder.
 * Se till att klassen har en konstruktor som tar förnman, efternamn, och ålder som parametrar.
 *  SKriv även en lämplig toString() metod.
 * 
 * Skapa sedan ett program som läser in information om en person från terminalen
 * Skapa ett person-objekt och skriver ut det objektet på terminalen.
 */

import java.util.Scanner;
public class V3L4O4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // Förrnamn
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        // Efternamn
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        // Ålder
        System.out.print("Age: ");
        int age = scanner.nextInt();


        scanner.close();
        
        // Person objekt 1:
        Person p = new Person(firstName, lastName, age);
        System.out.println("Identification: " + p);
    }
    
}
