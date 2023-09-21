//Övning 2
// Skapa en klass som skapar två objekt av klassen Car och tilldelar värden till alla fält. 
// Skriv sedan ut all data på terminalen.



public class V3Lek5Ovning2 {
        public static void main(String[] args) {
            car car1 = new car();                  //Objekt1 
            car car2 = new car();                  //objekt2

        //Tilldelar värden till alla fält

        car1.register = "HZN105";
        car1.model = "Peugeot 208";
        car1.year = 2012 ;
        car1.weight = 1413;
        car1.hPow = 90 ;

        car2.register = "TNS105";
        car2.model = "Tesla 3";
        car2.year = 2017;
        car2.weight = 1835;
        car2.hPow = 208;
   
        System.out.printf("Car1 : %s %nRegistration: %s %nYearModel %d %nWeight: %.2f kg %nHorsePower %.2f kW  "
        ,car1.model,  car1.register , car1.year, car1.weight ,car1.hPow   );

        System.out.printf("%n%nCar model: %s %nRegistration: %s %nYearModel %d %nWeight: %.2f kg %nHorsePower %.2f kW   "
        ,car2.model,  car2.register , car2.year, car2.weight ,car2.hPow);
            
        }

}