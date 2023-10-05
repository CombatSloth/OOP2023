/* Övning 2
 *  Lägg till ett villkor i slutet av ovanstående lösning så den, 
 *  Om Arean är större än 1000, skriver ut att rektangel är jättestor
 * 
 */
import java.util.Scanner;
public class V2L3O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Höjden(cm): ");
        int height = scanner.nextInt();

        System.out.print("Bredd(cm): ");
        int width = scanner.nextInt();

       float Area = height * width;
       float Circumference = (2*height) + (2*width);

       System.out.printf("Area för rektangeln blir: %.2f cm2 %n", Area );
       System.out.printf("Omkretsen för rektangeln blir: %.2f cm %n", Circumference);

       if (Area >= 1000) System.out.println("Rektangeln är jättestor");


        scanner.close();
    }
}
