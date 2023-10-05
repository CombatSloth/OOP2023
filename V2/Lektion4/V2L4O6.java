/* Övning 6
 * 
 *  Skriv ett program som beräknar n! dvs n fakultet n! = n *4*3*2*1
 * 
 */

 import java.util.Scanner;
public class V2L4O6 {
   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Skriv ett tal för fakultet: ");
    int n = scanner.nextInt();

    int sum = 1;
    for(int i=1; i <=n; ++i) {

        sum *= i;
    }

    scanner.close();
    System.out.println("Fakultet för " + n + " är " + sum);

   } 
}
