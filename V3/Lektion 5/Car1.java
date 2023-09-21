//Övning 3
// Inom objektorientering vill vi kapsla in implementationsdetaljer och göra det lättare att ändra koden i efterhand.
//för att få till det är det inte så bra att låta användaren direkt komma åt interna variabler i en klass.

class Car1 {

    private String register;
    private String model;
    private int year;
    private double weight;
    private double hPow;

    //Getter                      // a getter method is used to retrieve the value of a private field from a class.
    public String getRegister() {
        return register;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getWeight(){
        return weight;
    }
    public double getHpower(){
        return hPow;
    }

    //Setter                         // a setter method is used to set the value of a private field in a class.
    public void setRegister(String register){
        this.register = register;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHpower(double hPow){
         this.hPow = hPow;
    }
       
    public void print(){
        System.out.printf("Car : %s %nRegistration: %s %nYearModel %d %nWeight: %.2f kg %nHorsePower %.2f kW  %n%n%n"
        ,model, register , year,weight ,hPow );
    }

}
