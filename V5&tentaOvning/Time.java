import java.util.Scanner;

public class Time {
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
            // LEET ADDITION
            if (timeString.equals("13:37")) {
                System.out.println("LEET");
            }
            System.out.println("Det är ett korrekt klockslag!");
        }   
        else System.out.println(" Det är INTE ett korrekt klockslag!");

        scanner.close();
    }
}
