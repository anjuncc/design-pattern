package a.j.designpattern.singleton;

/**
 * Created by anjun on 3/24/16.
 */
public  class  JavaSingleton{
    private static JavaSingleton  instance  = null ;
    private JavaSingleton() { }
    public static JavaSingleton  getInstance() {
        if( instance == null) {
            synchronized(JavaSingleton.class){
                if(instance==null){
                    instance = new JavaSingleton();
                }
            }

        }
        return instance ;
    }
}