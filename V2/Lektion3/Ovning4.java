//På ett prov kan man få max 50 poäng. Gränsen för G går vid 20, för VG 35 och MVG 44. Skriv ett program som
//läser in poängen och returnerar betyget.
//Tankeprocess:
// 1. Skapa en input varibel med hjälp Scanner inmatning.
// 2. if, else if och else- satsen 

import java.util.Scanner;
public class Ovning4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv ditt poäng");
        double point = scanner.nextDouble();
        if (point >=20 && point <35) {
            System.out.println("Du får betyget G");
        }
        else if (point >=35 && point <44) {
            System.out.println("Du får betyget VG");
        }
        else if (point >=44){
            System.out.println("Du får betyget MVG");
        }
        else {
            System.out.println("Du får betyget IG. Tyvär");
        }
    scanner.close();
    }
    
}
