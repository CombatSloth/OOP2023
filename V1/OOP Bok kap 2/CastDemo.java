//Demonstrate casting.

public class CastDemo {
    public static void main(String[] args) {
        double x,y ;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        //Truncation will occur in this conversion
        i = (int)(x/y); // cast double to int
        System.out.println("Integer outcome of x/y is " +i);

        //No loss of info here. A byte can hold the value 100.
        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        // Information loss this time. A byte cannot hold the value 257.
        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88;// ASCII CODE for X
        ch = (char) b; //casting between incompatible types
        System.out.println("ch: " + ch);

    }
}
