/* This programs displays a conversion table of gallons to liters
*/

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

    counter =0;   //line counter is initially set to zero
    for (gallons =1; gallons <=100; gallons++){
        liters = gallons * 3.7854;   //convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    
    counter++;   // Increment the line counter with each loop iteration.
    if (counter ==10){  // If counter is 10 output a blonk line.
        System.out.println();
        counter =0; // reset the line counter
    }
    }

    }
}
