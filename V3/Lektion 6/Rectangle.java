public class Rectangle {
    double height;
    double width;


    // Konstruktor 1
    public Rectangle(){
        this (1,1);
    }

    // Konstruktor 2
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    

    

    


    
    public String toString(){
        return String.format("Rectangle(%f,%f)",height,width);
    }
}
