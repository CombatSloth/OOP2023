/* Övning 9
 * 
 * En populär anställningsintervjuer är FizzBuzz.  Ett program som räknar till 100. 
 *  varefter tal som är delbart med 3 ska sgäa Fizz, och tal som är jämt delbara med 5 skall säger Buzz.
 * talen som är delbara med både ska säga FizzBuzz
 * 
 * Skapa ett FizzBuzz program som producerar korrekt FizzBuzz för alla upp till hundra.
 * 
 */


public class V2L4O9 {
    public static void main(String[] args) {
        

        for (int i = 1; i <= 100 ; ++i){

            System.out.println(i);
            
            if (i%3 == 0) System.out.println("Fizz");
            if (i%5 == 0) System.out.println("Buzz");
            if (i%3 ==0 && i%5 == 0) System.out.println("FizzBuzz");

        }

    }
}
