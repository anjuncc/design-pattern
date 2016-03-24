package a.j.designpattern.templatemethod;

/**
 * Created by anjun on 3/24/16.
 */

public abstract class Template{
    public void process(){
        subMethodA();
        subMethodB();
    }
    protected abstract void subMethodA();
    protected abstract void subMethodB();
}