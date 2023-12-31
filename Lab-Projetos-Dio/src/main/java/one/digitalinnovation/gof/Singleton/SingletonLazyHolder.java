package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "lazy Holder"
 */
public class SingletonLazyHolder {
    private  static  class  InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static  SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
