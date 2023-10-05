/* Övning 3
 * 
 * Skriv ett program som skriver ut alla tal från och med 2147483640 till 2147483647
 * 
 * 
 */

public class V2L4O3 {
    public static void main(String[] args) {
        
        for (int i = 2147483640; i<= 2147483647; i++){

            System.out.println(i);

            if (i == Integer.MAX_VALUE) break;
        }
    }
}
