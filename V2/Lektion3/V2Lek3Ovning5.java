//Övning 5
// Skriv ett program där användare får mata in ett tal. 
// Programmet skall då skriva ut " Hej " 3 ggr så många som talet.

import java.util.Scanner;
public class V2Lek3Ovning5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

            System.out.print("Skriv in ett tal ");
            int nummer = scanner.nextInt();

            for(i = 0; i<nummer*3 ; ++i ){    
                System.out.print(" Hej ");
             
            }
    }
}
