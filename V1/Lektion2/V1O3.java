/* Övning 3
 * Skapa en klass innehåller koden från övning 2. men gör alla variabler till float istället.
 * Vad behöver vi göra för att få det att fungear korrekt?
 * 
 * SVAR: behvöer ha en typekonvertring som tvingar de två double variabler att spara värde till float. Trunkering kan gör att information i sparade värde gå förlora.
 */

public class V1O3 {
    public static void main(String[] args) {
        double radius = 12.3;
        
        double circumference;
        double area;

        circumference = (float)(radius*2) * StrictMath.PI;
        area = (float)(Math.pow(radius, 2) ) * StrictMath.PI;

        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
        }
}
