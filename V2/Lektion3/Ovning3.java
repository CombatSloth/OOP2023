// Ovning 3:
// Skriv ett program där användaren uppmanas att skriva in sitt födelseår med fyra siffror. Gör en if-sats som
// skriver ut om användaren är myndig eller ej i år. Programmet behöver bara fungera 2020 ut.
//Tankeprocess:
// 1. Skapa en variabel. En för föddelsedag.

import java.util.Scanner;
public class Ovning3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv ditt födelseår: ");
        int Byear = scanner.nextInt();
        int gap = 2020 - Byear;
        if (gap >=18) {
            System.out.print("Du är myndig");
         }
        else {
            System.out.println("Du är inte myndig");
            }

        scanner.close();
    }
}
