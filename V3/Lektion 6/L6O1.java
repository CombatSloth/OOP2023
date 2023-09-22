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

//Övning 3
// Man kan anropa en annan konstruktor från en konstruktor. Den måste dock vara första raden i konstruktor.
// Vi gör detta genom anrop med this()
//

public class L6O1 {
        public static void main(String[] args) {

            Rectangle rect = new Rectangle();
            System.out.println(rect);

            Rectangle rect2 = new Rectangle(99,99);
            System.out.println(rect2);
        }
    }

        class Color {             //En ytterklass.
            private int red;
            private int green;
            private int blue;
            
        public Color (int red, int green, int blue) {       //konstruktor1 med parameter i integer. 
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

