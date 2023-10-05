/* Övning 1
 * 
 * Skriv ett program som låter användaren skriva in två tal.
 * Programmet skall sedan skriva ut alla tal mellan dessa, i stigande ordning, oavsett vilken ordning talen skrevs in.
 */

import java.util.Scanner;
public class V2L4HO1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ange Tal 1: ");
        int tal1 = scanner.nextInt();

        System.out.print("Ange Tal2: ");
        int tal2 = scanner.nextInt();

        int i;
        if (tal2 > tal1){

            for(i = tal1; i <= tal2; ++i ){
                System.out.print(i+ " ");
            }
        } else {
            for(i = tal2; i <= tal1; ++i)
            System.out.print(i+ " ");
             
        }

        scanner.close();
        
    }


}