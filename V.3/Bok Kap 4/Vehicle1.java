// Add a parameterized method that computes the fuel required for a given distance.

public class Vehicle1 {
    int passengers;  // number of passengers
    int fuelcap;     // fuel capacity in gallons
    int mpg;         // fuel consumption in miles per gallon.

  
    int range() {                             // return the range.
        return mpg * fuelcap;
    }

    double fuelNeeded(int miles) {           // Compute fuel needed for a given distance.
        return (double) miles / mpg;
        
    }
    
}
