package Lektion4;
import java.util.Scanner;

// Övning1 
// SKriv ett program som beräknar n! dvs. n fakultet. n! = n..*3*2*1. 
// Exempel n! 4 = 4*3*2*1 = 24.
//TankeProcess
//1. skapa variabel för fakultet med namnet n!.
//2. 

public class Ovning1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ange ett värde för fakulteten: ");
            int n= scanner.nextInt();
        
        int fac = 1;   
        for (int i = 2; i<= n; ++i) {
            fac = fac * i;

        System.out.println(fac + "*" + i );
        }
        System.out.printf("!n för %s är %s %n", n , fac);


         // Lite överkomplicerad. Jag vill att programmet fråga om jag vill se hela uträkning.
        //System.out.println("Vill du se hela uträkningen?  Svara med y/n ");
        //      Boolean a =scanner.nextBoolean();

        // if ( a.equals("y") ){
            
        // System.out.println(fac + "*" + i);
        //} 
        //else {
            //    System.exit(0);
            //}

        

    }
}
