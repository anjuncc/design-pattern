package a.j.designpattern.adapter;

/**
 * Created by anjun on 3/24/16.
 */

public class Adapter implements ServiceProviderInterface {
    private final ServiceProviderImpl impl;

    public Adapter(ServiceProviderImpl impl) {
        this.impl = impl;
    }

    public void service(String property) {
        impl.service("afa", property);
    }
}
