//Övning5
// Skapa en ny metod boolean isClassic() i en ny klass.
// Det ska retunerar sant om bilens år är mer än 25 år.
// Ändra i main-metoden för förra övning så vi skriver om någon av de två bilarna är en veteranbi.

public class BooClass {
    
    private String register;
    private String model;
    private int year;
    private double weight;
    private double hPow;
    
    public boolean isClassic() {
        if (2023- year >= 25) {
            return true;
        }
        return false;
        
    }
    
}
