// a program that uses the Vehicle Class.
public class Vehicle {
    int passengers;  // number of passengers
    int fuelcap;     // fuel capacity in gallons
    int mpg;         // fuel consumption in miles per gallon.
    
   // Add range to Vehicle.
   // Display the range.
   void range() {
    System.out.println("Range is " + fuelcap * mpg); // Notice that fuelcap and mpg are used directly without . operator.
   }
}
