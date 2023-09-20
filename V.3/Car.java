// Övning 1
// Skriv en klass som beskriver bilar. Kalla klassen Car.
// En bil skall ha registreringsnummer, fabrikat, årsmodell, tjänstevikt och motoreffekt.
// Välj lämpliga namn och typer för instansvariablerna.
// TankeProcess
// 1. Namnge ett lämplig namn till klassen. I detta fall, Car.
// 2. Namnge variabler med lämplig datatyp enligt intruktionen. 


// Övning 3
// Inom objektorientering vill vi kapsla in implementationsdetaljer 
// göra det lättare att ändra koden i efterhand.
// Ändra så alla medelemsvariabler är private 
// och inför get och set-metoder för allihopa.
// TankeProcess
// 1. skapa get och set- metoder med lämpligt namn.
public class Car {
        String registration;
        String model;
        int year;
        double kerbWeight;
        double enginePower;  

        public String getRegistration(){
                return registration;
        }
        public void setRegistration(String registration){
                this.registration = registration;
        }
        public String getModel(){
                return model;
        }
        public void setModel(String model){
                this.model = model;
        }
        public int getYear(){
                return year;
        }
        public void setYear(){
                this.year = year;
        }
        public double getKerbWeight(){
                return kerbWeight;
        }
        public void setKerbWeight(){
                this.kerbWeight = kerbWeight;
        }
        public double getEnginePower(){
                return enginePower;
        }
        public void setEnginePower(){
                this.enginePower = enginePower;
        }


}
