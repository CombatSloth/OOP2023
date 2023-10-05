
/* Övning 8
 * 
 * I paket java.util finns det många klasser, bland Random som hjälper oss att enklare skapa olika typer av slumptal.
 * Egentligen borde vi använda oss av klassen TrendLocalRandom för det bästa Java- koden .
 * I denna övning skall du får importera Random.
 * 
 * Skriv ett program där programmet slumpar fram ett hemligt tal 1 - 10 (inklusiv) 
 * och användaren sedan får gissa talet
 * 
 * Programmet skall säga om det är rätta talet är lägre eller högre än det gissade
 * Användaren skall får gissa till gissa rätt
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class V2L4O8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Datorn har gissat ett tal(1 -10 ): ");
        int correct = rand.nextInt(10);

      
        int guess;
        int tries = 0;
    do {
            System.out.print("Gissa ett nummer(1-10): ");
            guess = scanner.nextInt();

            if (guess < correct) System.out.println("För låg");
            if (guess > correct) System.out.println("För stor");

            tries += 1;

            if (guess == correct) break;

        } while (guess != correct);
        

        scanner.close();
        System.out.println("Du gissade rätt med " + tries + " gissningar" );
    }

}
