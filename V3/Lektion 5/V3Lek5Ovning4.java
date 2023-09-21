//Övning 4
// Flytta utskriften av data (i main-metoden) från tidigare övning till nya metod print() i klassen Car.
//

public class V3Lek5Ovning4 {
    public static void main(String[] args) {
    

        Car1 car1 = new Car1();
        Car1 car2 = new Car1();

    
        // Tilldela värden med setter.

        car1.setRegister("HZN105");
        car1.setModel("Peugeot 208");
        car1.setYear(2012);
        car1.setWeight(1413);
        car1.setHpower(90);
        
        car2.setRegister("TNS105");
        car2.setModel("Tesla 3");
        car2.setYear(2017);
        car2.setWeight(1835);
        car2.setHpower(208);

        car1.print();
        car2.print();
    }
    
}
