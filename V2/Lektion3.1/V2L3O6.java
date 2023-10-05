/* Övning 6
 * 
 * Med switch-satsen kan vi göra olika saker beroende på en uppsättning fasta värden. 
 * Det vanligaste är att man användaer switch tillsammans med heltal eller enumerationer,
 * Gör ett program där man får mata in två heltal och sedan välja om man vill visa vilket av talen som var störst eller minst genom att skriva in t.ex. "min" eller "max"
 */


import java.util.Scanner;
public class V2L3O6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv ett heltal: ");
        int tal1 = scanner.nextInt();

        System.out.print("Skriv ett till heltal: ");
        int tal2 = scanner.nextInt();

        System.out.print("Vad vill du veta om talen (min/max:)");
        String answer = scanner.next();

        int min, max;
        if (tal1 > tal2){
            max = tal1;
            min = tal2;
        } 
        else {
            max = tal2;
            min = tal1;
        }

        switch (answer.toLowerCase()){
            case "min":
            System.out.println("Det minsta talet är: " + min );
            break;
            case "max":
            System.out.println("Det högsta talet är: " + max);
            break;
            default:
            System.out.println("Nope, im done here");
            break;
        }
     
        
        scanner.close();
    }
    
}
