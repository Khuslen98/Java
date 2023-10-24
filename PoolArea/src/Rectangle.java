public class Rectangle {
    private double width;
    private double length ;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length ;
    }
    public double getArea() {
        return width * length ;
    }

    public Rectangle(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.length  = 0;
        } else {
            this.length  = height;
        }
    }
}
