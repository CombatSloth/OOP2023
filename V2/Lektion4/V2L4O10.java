/* Övning 10
 *  Skriv ett porogram som skriver ut alla tal som är jämt delbara med 3 mellan 3 - 100.
 * Din kod inuti main får har max 3 rader
 * 
 * 
 * 
 */

public class V2L4O10 {
    public static void main(String[] args) {
        
        for (int i = 3; i<= 100; ++i){
            if (i%3 ==0) System.out.println(i);
        }
    }
}
