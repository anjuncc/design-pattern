package a.j.designpattern.adapter;

/**
 * Created by anjun on 3/24/16.
 */
public class Main {
    public static void main(String[]args){
            ServiceProviderInterface service = new Adapter(new ServiceProviderImpl ());
    }
}
