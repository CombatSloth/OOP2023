public class VehicleTwo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();     // 1st object 
        Vehicle sportscar = new Vehicle();   // 2nd object with the same instance variables
        
        int range1, range2;
        
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportcar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the ranges assuming a full tank of gas
        range1= minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);        
    }
        // Minivan's data is completely separate from the data contained in sportscar.
}
