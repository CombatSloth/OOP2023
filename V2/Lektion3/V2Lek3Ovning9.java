//Övning 9
// Skapa en FizzBuzz progam som producerar konrekt FizzBuzz för alla tal upp till 100.
// Tänk på att du kan använda modulus-operatorn % för att få resten vid heltalsdvision. 4%2 ==0 ;
// om i % 3 == 0  Fizz
// om i % 5 == 0  Buzz

public class V2Lek3Ovning9 {
    public static void main(String[] args) {
        
        for(int i=1; i<100; i++ ){

            if( i% 3 ==0){
                System.out.println("Fizz");
            }
            else if (i%5 ==0) {
                System.out.println("Buzz");
            }
            else
                System.out.println(" " + i);
        }
    }
}
