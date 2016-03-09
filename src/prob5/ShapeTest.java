package prob5;

/**
 * Created by bit on 2016-03-09.
 */
public class ShapeTest {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(5, 6);
        Shape rectTriangle = new RectTriangle(6, 2);
        Shape [] shapeList = new Shape[2];
        shapeList[0] = rectangle;
        shapeList[1] = rectTriangle;

        for(Shape shape:shapeList){
            System.out.println("area: "+shape.getArea());
            System.out.println("perimeter: "+shape.getPerimeter());
            if(shape instanceof Resizable) {
                Rectangle rect = (Rectangle)shape;
                rect.resize(0.5);
                System.out.println("new area: " + rect.getArea());
                System.out.println("new perimeter: " + rect.getPerimeter());
            }
        }
    }

}
