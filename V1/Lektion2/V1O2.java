/* Övning 2
 * Skapa en klass innehåller följande kod
 * 
 * Komplettera koden så att den skriver ut omkrets och area för den givna cirkelradien
 * Använd konstanten StricMath.pi
 */

public class V1O2 {
    public static void main(String[] args) {
        double radius = 12.3;
        double circumference;
        double area;

        circumference = (radius*2) * StrictMath.PI;
        area = (Math.pow(radius, 2) ) * StrictMath.PI;

        // code goes here, use StrictMath.PI
        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
        }
}
