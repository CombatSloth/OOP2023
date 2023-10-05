/* Use the pythagorean theorem to find the length of the hyptenuse give the length of the two oppsing sides */
public class Hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);
        System.out.println("Hypotenuse is " + z);
    }
}
