/* Övning 2
 * 
 * Lägg till en till konstruktor i klassen Rectangle som tar en bredd och höjd som argument.
 * Skapa en till rektangel i din main-metod med hjälp av din nya konstruktor.
 * Skriv ut den med terminalen.
 */

public class V3L6O2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(50, 50);

        System.out.println(rect1);
        System.out.println(rect2);
    }
}
