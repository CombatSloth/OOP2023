// Övning 6
// SKriv ett program som beräknar n! dvs n fakultet. n! = n..*4*3*2*1 

import java.util.Scanner;
public class V2Lek3Ovning6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv ett tal: " );
        int tal = scanner.nextInt();

        int fac =1;
        for (int i = 1; i <= tal; ++i) {
            fac = fac * i;
        System.out.print(" * " + i );

            
        }
        System.out.printf(" \nfakulteten för ditt tal %d är %d: " ,tal , fac );
        scanner.close();
    }
}
