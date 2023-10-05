/* Övning 5
 * 
 * Ett vanligt brev får inte vara större än 600 långt, 100mm tjockt.
 * tjocklek + bredd + längdn får inte överstiga 900mm. 
 * Ett brev måste vara minst 140mm lång och 90mm brett.
 * 
 * Skriv ett program som undrersöker om ett brev är korrekt dimensioner.
 */

import java.util.Scanner;
public class V2L3O5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

        System.out.print("Brevets längd(mm): ");
        double length = scanner.nextDouble();

        if (length>600 ) {
            System.out.println("Angiven längden " + length + " är förstor"); 
            System.out.println(" Vänligen välj annat mått som inte är större än 600mm");
            break;
        } else if (length < 140){
            System.out.println("Angiven längden" + length + " är för små");
            System.out.println("Vänligen välj annan längd som inte är mindre än 140mm");
            break;
        }

        System.out.print("Brevets tjocklek(mm): " );
        double thickness = scanner.nextDouble();

        if (thickness > 100){
            System.out.println("Angiven tjockleken " + thickness + " är förstor");
            System.out.println(" Vängen välj annan mått som inte är större 100mm");
            break;
        }

        System.out.print("Brevets bredd(mm): ");
        double width = scanner.nextDouble();

        if (width < 90) {
            System.out.println("Angiven bredden " + width + " är för små" );
            System.out.println("Vänligen välja annat mått som är inte mindre än 90mm");
            break;
        }

        double sum = length + width + thickness;

        if (sum > 900){
            System.out.println("Brevet är fortfarande för stor ");
            System.out.println("Vänligen välj annat mått");
            break;
        } else {
             System.out.println("Måtten på brevet är OK!");
             break;
        }
       

        }

        scanner.close();
        
        
      
 



        
    }
    
}
