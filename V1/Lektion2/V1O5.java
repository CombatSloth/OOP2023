/* Övning 5
 * 
 * Hitta felet i följande kod. Rätta det, kompilera och kör.
 * 
 * SVAR: Använd type konvertering. Felet var att aritmetiska operation med byte ger alltid en int som resultat.
 */

public class V1O5 {
    public static void main(String[] args) {
        byte a = 2;
        byte b = 3;
        int c = (a * b);
        System.out.println("Svar: " + c);
        }

}