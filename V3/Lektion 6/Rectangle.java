//Övning1
//Skapa en ny klass Rectangle innehållande Width och Height som float.
//Skapa en konstruktor utan argument om initierar Width and Height till 1.
//Skapa en toString() metod.
//Skapa en klass Övning 1 innehållande en main metod.
//Skriva ut på terminalen

//Övning 2
// Lägg till en konstruktir i klassen som tar Width och Height som argument.
// Skapa en till rektangel.
// Skriva ut den på terminalen.
public class Rectangle {
    
        double height;
        double width;


        public Rectangle(){
            this(1,1);    //Konstruktor 3 som anrop 
        }

    //    public Rectangle(){      //Konstruktor 1 utan parameter med medlemvariabler 1.
    //        height = 1;
    //       width  = 1;
    //    }

    
        
        public String toString(){     //Konstruktur 2 utan parameter
            return String.format("Rectangle(%.2f, %.2f)", height, width);
        }

        public Rectangle(int height, int width){   //konstruktur 3 med parameters med integer type.
            this.height = height;
            this.width = width;
        }

      
        
}
    





