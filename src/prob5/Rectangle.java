package prob5;

/**
 * Created by bit on 2016-03-09.
 */
public class Rectangle extends Shape implements Resizable{
    double width;
    double height;

    public Rectangle(double height, double width) {
        super(4);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public int getCountSides() {
        return super.getCountSides();
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public void resize(double rate) {
        width*=rate;
        height*=rate;
    }
}
