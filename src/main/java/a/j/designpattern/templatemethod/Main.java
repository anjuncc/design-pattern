package a.j.designpattern.templatemethod;

/**
 * Created by anjun on 3/24/16.
 */
public class Main extends Template{
    public  static  void main(String[]args){
            new Main().process();
    }

    @Override
    protected void subMethodA() {
        System.out.println("subMethodA");
    }

    @Override
    protected void subMethodB() {
        System.out.println("subMethodB");
    }
}
