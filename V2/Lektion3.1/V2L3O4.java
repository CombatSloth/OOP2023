/* Övning 4
 * 
 * På ett prov kan man få max 50 poäng
 * Gränsen G går vid 20, VG vid 35 and MVG vid 44.
 * Skriv ett program som läser in poängen och retunerar betyget.
 */

import java.util.Scanner;
public class V2L3O4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv ditt poäng (Max:50): ");
        int score = scanner.nextInt();

        if (score >= 20) System.out.println("Du har fått G");
        if (score >= 35) System.out.println("Du har fått VG");
        if (score < 20 ) System.out.println("Du har fått IG, vänligen boka om provtillfället");


        scanner.close();
    }
}
