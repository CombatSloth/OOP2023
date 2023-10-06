import java.util.Scanner;

public class XOfaculti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Mata in en siffra mellan 1 - 20
        System.out.print("Skriv din matris(1-20): ");
        int N = scanner.nextInt();

        for(int row = 0; row < N; ++row){                    // For loopen 1 för sid-raden som loopar enligt angiven N.

            // Begränsning
            if(N >= 20) {
                System.out.println("För stor tyvär, vänligen välj 1-20");
                break;
            }
            
            
            System.out.println(" ");                      // Mellanrum
            
            for (int col =0; col<N; ++col){                 // For Loopen 2 för lodrät-raden som loopar enligt angiven N.

                if (row == col) {                           // If satsen för om värde i row och col lika varandra. Skriv ut 1, annars 0.
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }

        }

        scanner.close();
    
        
    }
}
