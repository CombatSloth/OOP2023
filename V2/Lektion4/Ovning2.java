package Lektion4;
import java.util.Scanner;
//En boll släpps från en viss höjd och förlorar 30% av sin studshöjd för varje studs. Bollen ligger still när
//studshöjden understiger 1 cm. Indata är höjden som bollen släpps från och utdata är antalet studsar den gör.
//TankeProcess
//1. Inmatningsfunktion Scanner.
//2. Skapa variabel för hojden(indata) och antal studs(utdata).
//3. Bollen studsar så länge höjden > 0.01 meter.
//4. Bollen förlora 30% av höjden för varje studs Bollen höjden =  höjden * (1-0.3) för varje studs.
public class Ovning2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange starthöjden(m): ");
        double height = scanner.nextDouble();

        int  bounceCount =0; 
        while (height > 0.01 ){
            height = height * (1-0.3);
            bounceCount ++;
        
        }
        System.out.printf("Bollen kommer att studsa %s gånger%n", bounceCount);

    }
    
}
