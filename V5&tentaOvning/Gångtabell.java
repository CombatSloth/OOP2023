import java.util.Scanner;

public class Gångtabell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Vilkengångbatell, Vill du veta? Skriva ett tal (1-20): ");
            int tabell = scanner.nextInt();

            if(tabell == 0) break;            //Infinite loop tills 0 matas in.
            
            for(int i = 1; i <=15; ++i){     //Upprepning till 12.
                int k = i * tabell;
                System.out.println( i + "*"+ tabell + " = " + k);
            }
            
        }
        scanner.close();
    }
    
}
