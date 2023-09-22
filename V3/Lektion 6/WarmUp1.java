public class WarmUp1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1(10);
        Box1 box2 = new Box1(10, 10, 10);
        System.out.printf("Box 1 volume is %d.%n", box1.getVolume());
        System.out.printf("Box 2 volume is %d.%n", box2.getVolume());
        }
}
