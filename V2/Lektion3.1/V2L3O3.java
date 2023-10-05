/* Övning 3
 * 
 * Skriv ett program där användaren uppmanas att skriva in sitt födelseår med 4 siffror.
 * Gör en if -sats som skriver ut om användaren är myndig eller ej. 
 * Programmet behöver bara fungera 2020 ut.
 */

 import java.util.Scanner;
public class V2L3O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv in ditt födelseår: ");
        int age = scanner.nextInt();

        int i = 2020 - age;
        if ( i >= 18) {

        System.out.println("Du är " + i + " år");
        System.out.println("Du är myndig");
        }
        else {
             System.out.println("Du är " + i + " år");
             System.out.println("Du är inte myndig");
        }
           
        scanner.close();
    }
}
