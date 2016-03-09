package prob5;

/**
 * Created by bit on 2016-03-09.
 */
public abstract class Shape {
    private int countSides;

    public Shape(int countSides){
        this.countSides = countSides;
    }
    public int getCountSides(){
        return countSides;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}
