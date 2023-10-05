/* Övning 3
 * 
 * Med hjälp av String.valueOf (intvalue) kan vi få ut en strängrepresentation av ett tal.
 * Med metoden charAt(index) kan vi få ut ett visst tecken ur en sträng.
 * 
 * Skriv ett program som läser in ett tal från användaren.
 * Och skriver ut hur många tal mellan ett och detta tal som börjar på siffran 1 
 * 
 * Se till att programmet fungerar om användaren skriver in ett negativt tal, fast då skall den gå från -1 ner till det negativa talet.
 */

import java.util.Scanner;
public class V2L4HO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ett tal: ");
        int tal1 = scanner.nextInt();
        int i;
        int count=0;

        if (tal1 < 0){
            for (i = -1; i >= tal1; --i){
                String number = String.valueOf(i);
                char firstDigit = number.charAt(1);
                if (firstDigit == '1') count ++;
            }
            System.out.println("Mellan -1 och " + tal1 + " finns det " + count + " tal som börja på en etta.");
        } 
        else {
            for (i = 1; i <= tal1; ++i){
                String number = String.valueOf(i);
                char firstDigit = number.charAt(0);
                if (firstDigit == '1') count ++;
            }
            System.out.println("mellan 1 och " + tal1 + " finns det " + count + " tal som börja på en etta.");
        }



        scanner.close();
    }
}
