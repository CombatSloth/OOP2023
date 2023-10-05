/* Uppvärning
 * 
 * 1. Skapa en ny klass Box.java. 
 * 2. Den ska ha två konstruktor.
 *  En som skapa en liksidig låda och en vi kan specificera varje sida storlek.
 */

public class V3L6Warmup {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10, 10, 10);

        System.out.println("Box 1 volume is: " + box1.getVolume());
        System.out.println("Box 2 volume is: " + box2.getVolume());
    }
}