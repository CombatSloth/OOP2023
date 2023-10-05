/* Övning 7 
 * 
 * En boll släps från en viss höjd och förlorar 30% av sin studshöjd för varje studs.
 * Bollen ligger still när studs höjden understiger 1 cm
 * Indata är höjden som bollen släpps 
 * Utdata är antalet studsar den gör
 */

import java.util.Scanner;
public class V2L4O7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange höjden bollen faller ifrån(m): ");
        double height = scanner.nextDouble();
        

        int BounceCount = 0; 
        while (height > 0.01){
            height *= 0.7;
            BounceCount += 1;
        }

        scanner.close();
        System.out.println("Bollen studsar " + BounceCount +" gånger " );
    }
}
