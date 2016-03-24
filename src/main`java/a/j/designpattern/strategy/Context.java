package a.j.designpattern.strategy;

/**
 * strategy 功能或算法可以替换
 * Created by anjun on 3/24/16.
 */

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int a, int b) {
        System.out.println(strategy.operation(a, b));

    }

    public static void main(String[] args) {

        new Context(new Multiply()).execute(5, 5);
    }
}