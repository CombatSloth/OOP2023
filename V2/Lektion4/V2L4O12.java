/* Övning 12

Skriv ett program som du kan spela sten-sax - påse mot. 
Användaren skall mata in sten,sax, eller påse och programmet ska slumpa fram ett motdrag.
Sedan ska vinnare presenteras. Om användare skriver in "sluta" skall spelet avslutas 
och det skall visas hur många gånger som användaren och datorn vunnit

Ange paper istället för påse i denna övning
*/ 

import java.util.Scanner;
import java.util.Random;

public class V2L4O12 {

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

            int Rock = 0;
            int Paper = 1;
            int Scissors =2;

            int comHit;
            int playerW = 0;
            int computerW = 0;
        gameLoop: while (true){    //Labeled loop


            // Myturn
            System.out.print("Choose Rock/Paper/Scissors or sluta: ");
            String myHit = scanner.next();
           
            int hit;
            switch (myHit){
                // Choose Rock  
                case "Rock": hit = Rock;
                break;
                // Choose Paper
                case "Paper": hit = Paper;
                break;
                // Choose Scissors
                case "Scissors": hit = Scissors;
                break;
                // Choose Sluta
                case "Sluta":
                break gameLoop;

                default: System.out.println("Vänligen välj en av de giva alternaiv, försök igen");
                continue; 
            }

        
            // Computers turn
            comHit = rand.nextInt(3);

            // Com choose Rock
            if (comHit == 0) { 
                comHit = Rock;
                System.out.println("Computer has chosen ROCK");
            }

            if (comHit == 1){
                comHit = Paper;
                System.out.println("Computer has chosen PAPER");
            }

            if (comHit == 2){
                comHit = Scissors;
                System.out.println("Computer has chosen SCISSORS");
            }

            //Winning Conditions


                            // All Rock scernario 
            // Com Rock vs My Paper
            if ( comHit == Rock && Paper == hit ) {
                System.out.println("Du Vann");
                playerW +=1;
                
            }

            // Com Rock vs my Scissor
            if (comHit == Rock && Scissors == hit ){
                System.out.println("Datorn vann");
                computerW +=1;
                
            }
            // Com Rock vs my Rock
            if (comHit == Rock && Rock == hit){
                System.out.println("Oavgjort");
                
            }
            
                             // All Paper scenerario
            // Com Paper vs My Scissors
            if (comHit == Paper && Scissors == hit ){
                System.out.println("Du vann");
                playerW +=1;
                
            }
            // Com Paper vs My Rock
             if (comHit == Paper && Rock == hit ){
                System.out.println("Datorn vann");
                computerW +=1;
                
            }
            // Com Paper vs My Paper
             if (comHit == Paper && Paper == hit ){
                System.out.println("Oavgjort");
                
            }
                         // ALL Scissors scenerio
            // Com Scissors vs My Rock
             if (comHit == Scissors && Rock == hit ){
                System.out.println("You vann");
                playerW +=1;
                
            }
            // Com Scissors vs My Paper
             if (comHit == Scissors && Paper == hit ){
                System.out.println("Datorn vann");
                computerW +=1;
                
            }
            // Com Scissors vs My Scissors
            if (comHit == Scissors && Scissors == hit ){
                System.out.println("Oavgjort");
                
            }
        
            }
            scanner.close();
            System.out.println(" Du har vunnit: " + playerW + " gånger");
            System.out.println(" Datorn har vunnit " + computerW +" gånger");
            
            if(computerW > playerW){
            System.out.println("COMPUTER HAS ONE. DOOM FOR HUMANITY");      
            }else if (computerW == playerW){
            System.out.println("Ties, Truce");
            } else System.out.println("HUMAN HAS WON. COMPUTER ENSLAVED");
          
        }
        
          
}
