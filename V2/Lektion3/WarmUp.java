import java.util.Scanner;
public class WarmUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vad heter du?");
        String name = scanner.nextLine();
        System.out.printf("Hejsan, %s.%n", name);
        scanner.close();
    }
    //Lite kommentarer på följfrågor: 
    // print() är en metod som används för att skriva ut en textstränga utan en ny rad i slutet
    // println() är en metod som  används för att skriva ut en textstränga med en ny rad i slutet.
    // printf() är en metod som används för formatterad(prepare to receive data) output. 
    //- Det tillåter dig att specificera en format med placeholder(%)
}