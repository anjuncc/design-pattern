package a.j.designpattern.bridge;

/**
 * Created by anjun on 3/26/16.
 */
/** "Abstraction" */
interface Shape
{
    public void draw();                                            // low-level
    public void resizeByPercentage(double pct);     // high-level
}