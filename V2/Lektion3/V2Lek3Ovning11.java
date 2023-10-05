//Övning 11
// En enhet elker identitetsmatrik är en kvadratisk matris (NxN) är ett medan alla andra värden är nol
// Skriv ett program som frågar efter önskad matrisstorlek 
// Skriv sedan ut en enhetsmatris.
import java.util.Scanner;
public class V2Lek3Ovning11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Vilken storlek på din enhetmastris: ");
        int matris = scanner.nextInt();

        for (int row =0; row<matris; ++row){
            for(int col =0; col<matris; ++col){
                if(row == col){
                    System.out.print("1 ");
                } 
                else {
                    System.out.print("0 ");
                } 
            }
             System.out.println("");
             scanner.close();
        }

    }
}
