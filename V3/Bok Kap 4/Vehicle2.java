// Add a constructor.

public class Vehicle2 {

    int passengers;  // number of passengers
    int fuelcap;     // fuel capacity in gallons
    int mpg;         // fuel consumption in miles per gallon.
    
    // This is a constructor for Vehicle.

    Vehicle2 (int p, int f, int m){     // this is a parameterized Constructor for Vehicle2
        passengers = p;
        fuelcap = f;
        mpg = m;
    } 

    // Return the range.
    int range(){
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return(double) miles / mpg;
    }
    
}
