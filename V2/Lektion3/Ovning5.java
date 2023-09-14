//Övning 5:

//Ett vanligt brev får inte vara större än 600mm långt, 100mm tjockt, bredd + tjocklek + längd får inte överstiga
//900mm. Ett brev måste vara minst 140mm långt och 90mm brett. Skriv ett program som undersöker om ett
//brev har korrekta dimensioner.
//Man kan antingen skriva ett stort uttryck i sitt villkor, eller så kan man använda variabler med typen boolean
//för att tydliggöra de olika villkoren.
// Tankeprocess:
//1. Ett brev  storlex ska max ha 600mm långt, 100mm tjockt
//2. Kanske är bra att ta reda på vad max bredden får vara. Omkretsen för brevet ska inte överstiga 900mm. 
//   bredden(mm) = 900 - 600 = 300mm.
//3. Skapa två varibler för min och max dimensioner.
//4. Skapa variabler för input bredd,längd,tjocktlek..
//5. Skapa en variabbel för dimensionen för angivit värde.
//6. if -satsen för width min och max.

import java.util.Scanner;

public class Ovning5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int okDimensionMax = 600 + 200;

        System.out.print("Ange ett tjocktlek(mm) : ");
        double thick = scanner.nextDouble();
            if (thick >100){
                System.out.println("Tjockleken måste vara minder än 100mm.");
                System.out.println("Tjockleken är ogiltigt");
                System.exit(0);
            }


        System.out.print("Ange ett bredd(mm): ");
        double width = scanner.nextDouble();
             if (width < 90 || width > 200) {
                System.out.println("Bredden måste vara minst 90mm men inte större än 200mm");
                System.out.println("Bredden på brevet är ogiltigt");
                System.exit(0);

        }

        System.out.print("Ange en längd(mm): ");
        double length = scanner.nextDouble();
            if (length < 140 || length > 600) {
                System.out.println("Längden måste vara minst 140mm men inte större än 600mm");
                System.out.println("Längden är ogiltig");
                System.exit(0);
            }

        double dimension = width + length;
        System.out.printf("Dimensionen är: %.2fmm %n", dimension);
        System.out.printf("Dimensionen %.2fmm på brevet är OK %n", dimension);

        scanner.close();

    }
}
