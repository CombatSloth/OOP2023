//Övning 8
// Skriv ett program där programmet slumpar fram ett hemlig tal 1-10(inklusive)
// Användaren sedan får gissa talet.
// Programmet skall säga om det rätta talet är lägre eller högre än det gissde.
//Användaren skall få giss tills hen gissa rätt.

import java.util.Random;
import java.util.Scanner;

public class V2Lek3Ovning8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomDouble = random.nextInt(10);     //Begränsat tal till 10.

        int guess;
        do  {
            System.out.print("Gissa ett tal jag har valt: ");
            guess = scanner.nextInt();

            if(guess<randomDouble){
                System.out.printf("Talet jag valt är större än %d %n" , guess);
            }
            else if (guess >randomDouble){
                System.out.printf("Talet jag gissat på är mindre än %d %n", guess);
            }
        } while (guess != randomDouble);      //Så länge guess inte är lika med randomDouble gör Do satsen.

        System.out.printf("%d är korrekt ", guess);      //utdata utanför do-satsen
        
    }    
}
 