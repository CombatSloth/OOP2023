//Övning 10
// Skriv ett program som skriver ut alla tal som är jämt delbara med 3 mellan 3 till 100.
// Din kod för max har 3 rader och 3 semikolon
public class V2Lek3Ovning10 {
    public static void main(String[] args) {
        for(int i =3; i<100; ++i){
            if (i%3==0){   
                System.out.println(i + "är delbart med 3");
            }
            else 
            System.out.println(i);
        }
    }
}
