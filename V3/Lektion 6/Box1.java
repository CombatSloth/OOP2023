public class Box1 {
    
    private int height;
    private int width;
    private int depth;
  
    public Box1(int size) {                       //Constructor1
    this.height = size;
    this.width = size;
    this.depth = size;
    }

    public Box1(int height, int width, int depth) {  //Construct2
    this.height = height;
    this.width = width;
    this.depth = depth;
    }
    public int getVolume() {
    return height * width * depth;
    }
}