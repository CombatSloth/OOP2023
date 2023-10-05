public class Box {

    private int height;
    private int width;
    private int depth;

    // Konstruktor 1
    public Box (int size) {
    this.height = size;
    this.width  = size;
    this.depth  = size;
    }

    // Konstruktor 2
    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    // Metod för volym
    public int getVolume(){
        return height * width * depth;
    }

} 


