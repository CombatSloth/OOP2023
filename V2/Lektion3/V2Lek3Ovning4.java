//Övning 4
// Skirv ett program där användaren får mata in tal tills användaren matar in en nolla. 
// Då skall programmet visa summan av alla de inmatade talen

import java.util.Scanner;
public class V2Lek3Ovning4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Sum = 0;

        while(true){
            System.out.print("Jag har valt ett tal. Du får gissa talet: ");
             int nummer = scanner.nextInt();
             if (nummer ==0){
                break;
             }

             Sum += nummer;
        }
        System.out.printf("Summan av de inmatade talen: %d ", Sum);
        scanner.close();
    }
}
