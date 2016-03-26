package a.j.designpattern.bridge;

/**
 * Created by anjun on 3/26/16.
 */
/** "Refined Abstraction" */
class CircleShape implements Shape
{
    private double x, y, radius;
    private DrawingAPI drawingAPI;
    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI)
    {
        this.x = x;  this.y = y;  this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    // low-level i.e. Implementation specific
    public void draw()
    {
        drawingAPI.drawCircle(x, y, radius);
    }
    // high-level i.e. Abstraction specific
    public void resizeByPercentage(double pct)
    {
        radius *= pct;
    }
}