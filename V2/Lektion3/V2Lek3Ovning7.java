// Övning 7
// En boll släps från en viss höjd och förlora 30% av sin studstöjd för varje studs
//Bollen ligger still när studshöjden understiger 1 cm.
// Indata är höjden som bollen släpps från.
// utdata är antalet studs den gör.

import java.util.Scanner;
public class V2Lek3Ovning7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in höjden bollen släpps ifrån (i meter): " );
        double height = scanner.nextDouble();

        int bounce = 0;
        while(height>0.01){
            height = height * (1-0.3);
            bounce ++;
        }

        System.out.printf("Bollen kommer att studsa %d gånger", bounce);

    }

       
}
