
// Övning 1: 
// Skriv ett program som ber användaren mata in bredd och höjd på en rektangel (som ett flyttal) och sedan
// skriver ut rektangelns omkrets och area med två decimaler.
// Tankeprocess:
// 1. Rektangel fomulär är  bredd * längd
// 2. Beräka Area och Omkrets och svara med två decimaler. I det här fallet omkrets = cm och area =  cm²
// 3. skapa varibler för bredd och längd.


import java.util.Scanner;
public class Ovning1 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur mycket är längden?: ");
        double width = scanner.nextDouble();
        System.out.println("Hur mycket är bredden?: ");
        double length = scanner.nextDouble();

        double rekArea = width * length;
        double rekCir = 2*width + 2*length;

        System.out.printf("Längden: %.2f cm%n", width);
        System.out.printf("Bredden: %.2f cm%n",   length);
        System.out.printf("Omkretsen på rektangel blir: %.2f cm%n", rekCir);
        System.out.printf("Area på rektangel blir: %.2f cm²'%n ", rekArea);
           
                
            if (rekArea >= 1000) {
                System.out.print("Rektangeln är jättestor");
            }
          
        scanner.close();    

// Övning 2:
// Lägg till ett villkor i slutet av ovanstående lösning så den, om arean är större än 1000, också skriver ut att
// rektangeln är jättestor.
    
    }
}
