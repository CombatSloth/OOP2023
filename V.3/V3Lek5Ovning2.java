//Ovning 2
// Skapa en klass ExerciseTwo som skapar två objekt av klassen Car.
// Tilldela värden till alla fält.
// Skriv sedan ut data på terminalen.
// TankeProcess
// 1.
// 2.

public class V3Lek5Ovning2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.registration = "HZN105";
        car1.model = "Pegeot 207";
        car1.year = 2017;
        car1.kerbWeight = 2401;
        car1.enginePower = 160.5;

        Car car2 = new Car();
        car2.registration = "ANK313";
        car2.model = "LOL 207";
        car2.year = 1992;
        car2.kerbWeight = 812;
        car2.enginePower = 97;
        
        System.out.printf(
            "%s, reg %s från %d.%n Tjänstevikt %.2f och motoreffekt på %.2f kW .\n" , car1.model, car1.registration, car1.year, car1.kerbWeight, car1.enginePower);
        System.out.printf(
            "%s, reg %s från %d.%n Tjänstevikt %.2f och motoreffekt på %.2f kW.\n", car2.model,car2.registration, car2.year, car2.kerbWeight, car2.enginePower);
    }
}