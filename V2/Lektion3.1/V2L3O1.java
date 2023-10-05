/* Övning 1
 * 
 * Skriv ett program som ber användaren mata in bredd och höjd på en rektangel som ett flytal
 * sedan skriver ut rektangeln omkrets och area med två decimaler.
 * 
 */

import java.util.Scanner;
public class V2L3O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Höjden(cm): ");
        int height = scanner.nextInt();

        System.out.print("Bredd(cm): ");
        int width = scanner.nextInt();

       float Area = height * width;
       float Circumference = (2*height) + (2*width);

       System.out.printf("Area för rektangeln blir: %.2f cm2 ", Area );
       System.out.printf("Omkretsen för rektangeln blir: %.2f cm ", Circumference);


        scanner.close();
    }

}