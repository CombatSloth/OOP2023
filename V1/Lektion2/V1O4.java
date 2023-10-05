/* Övning 4
 * 
 * Sätt radien till 1e20 respetive 1e20f (10 upphöjt till 20) i dina Övning 3. Ge de olika svar? Varför? 
 * 
 * SVAR: Det blir för stor tal. 
 */

public class V1O4 { 
    public static void main(String[] args) {
        double radius = 1e20;
        
        double circumference;
        double area;

        circumference = (float)(radius*2) * StrictMath.PI;
        area = (float)(Math.pow(radius, 2) ) * StrictMath.PI;

        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
        }
}
