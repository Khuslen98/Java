public class Cuboid extends Rectangle {
    private double height;

    public double getVolume(){
        return getHeight() * getArea();
    }
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
}
