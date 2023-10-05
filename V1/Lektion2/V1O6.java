/* Övning 6
 * 
 * Skapa en klass innehåll följande kod.
 * Kompilera och kör programmet. varför blir dert olika resultat för resprekt rad?
 * 
 * SVAR: Det fungerar som det skall. Men applikationen sker inte på rad 2. Det kan ha med PEMDAS att göra.
 * Beräkning går enligt PEMDAS, och sedan vänster till höger.
 *  Första satsen: Uträkning gick att räkna mellan två heltal. Den följs sedan av en textsträng
 *  Andra satsen: Den första uträkningen är mellan textsträngen och a, b  behåll sitt värde.
 *  Tredje satsen: Additionen sker som vanlig pga parentesen.
 */ 
public class V1O6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + b + " is a magic number.");
        System.out.println("The magic number is " + a + b);
        System.out.println("Or maybe it is " + (a + b));
        }
}
