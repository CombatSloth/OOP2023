// Loopen räknar åt fel håll! Ändra startvärde, villkor och uppräkning så det istället räknar nedåt från 10 till 1

public class V2Lek3WarmUp {
public static void main(String[] args) {
    for (int i =10; i>=0; --i){
        System.out.printf("T minus %d seconds to lift off...%n", i);
    }
    System.out.println("..... and we have lift off");
}
}