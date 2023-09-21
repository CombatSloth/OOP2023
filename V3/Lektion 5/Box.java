
public class Box {
    private int height; 
    private int width;
    private int depth;
 
     public Box() {          //Constructor for initializing the box.
        this.height = 0;
        this.width =  0;
        this.depth =  0;
     }



            // Getter and setter methods for height, width, and depth.

    public int getHeight(){
        return height;
     }
            
    public void setHeight(int height) {        
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int Width) {
        this.width = width;

    }

    public int getDepth(){
        return depth;
    }
    
    public void setDepth(int depth){
        this.depth = depth;
    }

    public int getVolume() {
        return height * width * depth;                            //
    }

}