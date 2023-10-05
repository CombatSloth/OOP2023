/* Övning 5
 * 
 * Skriv ett program som kontrollerar att användaren matat in ett korrekt klockslag på formatet HH:MM.
 * dvs, en timme 00-23 och minuter 00-59 och ett kolon mellan.
 * 
 * Använd sträng-funktionerna vi lärt oss ovan för att ordna detta.
 * String.substring(int start, int end) för att plocka ut en delsträng 
 * och Integer.parseInt(String val) som gör om en sträng till ett heltal kan vara funtioner man kan ha nytta av.
 * Observa dock att parseInt kastar ett undertag om strängen inte kan konverteras och det är ok
 * 
 * 
 */
import java.util.Scanner;
public class V2L4HO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv ett krockslag: ");
        String timeString = scanner.nextLine();

        // Anta att det är inte korrekt från början

        boolean isCorrect = false;

        // first basic checks
        if (timeString.length() == 5 && timeString.charAt(2) == ':'){
            String hourString = timeString.substring(0, 2);
            int hour = Integer.parseInt(hourString);

            // then we check that the hour is correct
            if (hour >= 0 && hour <= 23){
                String minuteString = timeString.substring(3, 5);
                int minutes = Integer.parseInt(minuteString);

                // and finally the minutes
                isCorrect = minutes >= 0 && minutes <= 59;
            }
        }

        if (isCorrect) {
            System.out.println("Det är ett korrekt klockslag!");
        }   
        else System.out.println(" Det är INTE ett korrekt klockslag!");

        scanner.close();
    }
}
