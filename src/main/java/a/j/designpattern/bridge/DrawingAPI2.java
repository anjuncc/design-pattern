package a.j.designpattern.bridge;

/**
 * ConcreteImplementor
 * Created by anjun on 3/26/16.
 */
public class DrawingAPI2 implements DrawingAPI{
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
    }
}
