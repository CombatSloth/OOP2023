/* WarmUp
 * 
 * Skapa en klass och klistra in följande
 * 
 */

import java.util.Scanner;
public class V2L3WarmUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Vad heter du ?:  ");
        String name = scanner.next();
        System.out.printf("Hejsan, %s ", name);

        scanner.close();

    }
    
}
