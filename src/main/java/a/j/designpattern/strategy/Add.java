package a.j.designpattern.strategy;

/**
 * Created by anjun on 3/24/16.
 */
public class Add implements Strategy {
    public int operation(int a, int b) {
        return a + b;
    }
}