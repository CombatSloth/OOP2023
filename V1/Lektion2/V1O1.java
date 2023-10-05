/* Övning1
 *  Skapa en class innehåller en main-metod.
 * Deklarera en variable för varje av de åtta primivitiva typer och tilldela dem ett värde. 
 * SKriva sedan ut samtliga värden på terminalen ett värde per rad
 */


public class V1O1 {
    public static void main(String[] args) {
        int one = 1;
        byte two = 2;
        short three = 3;
        long four = 4;
        char five = 'A';
        Boolean six = true ;
        double seven = 7.777;
        float eight = 8.888f;

        System.out.println("Detta är en integer med värde:  " + one );
        System.out.println("Detta är en byte integer med värde:  "+ two);
        System.out.println("Detta är en short integer med värde: " + three);
        System.out.println("Detta är en long integer med värde: " + four);
        System.out.println("Detta är en char med bokstav: " + five);
        System.out.println("Detta är en Boolean med statement:" + six);
        System.out.println("Detta är en double med värde: " + seven);
        System.out.println("Detta är en float med värde: " + eight);
    }
}
