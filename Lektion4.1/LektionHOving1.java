import java.util.Scanner;
// Övning1:
// Skriv ett program som låter användaren skriva in två tal.
// Programmet skall sedan skriva ut alla tal mellan dessa.
//
// TankeProcess
// 1. Kommer behöva inmatningsmetoden Scanner.
// 2. Skapa 2 inmatningsbara variabler.
// 3. If
public class LektionHOving1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange ett tal: ");
        int tal1 = scanner.nextInt();

        System.out.print("Ange andra tal ");
        int tal2 = scanner.nextInt();

        if (tal1 < tal2) {
            for (int i= tal1 + 1; i<tal2; i++) {
                System.out.print(i + " ");
            } 
        }else if (tal1 > tal2) {
                for (int i= tal2 + 1; i<tal1; i++ ){
                    System.out.print(i + " ");
                }
        } else {
                System.out.println("");
            }

          


          
    }
}
