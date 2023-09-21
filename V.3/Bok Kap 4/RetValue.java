// Use a return value

public class RetValue {
    int passengers;  // number of passengers
    int fuelcap;     // fuel capacity in gallons
    int mpg;         // fuel consumption in miles per gallon.
    
    // Return the range.
    int range(){
        return mpg * fuelcap;  //Return the range for a given vehicle.
    }
}
