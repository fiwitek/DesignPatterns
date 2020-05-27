public class Singleton {

    /**
     * Used lazy instantiation, which allows
     * to create an object only if its needed,
     * that is when getInstance method is called.
     */
    private static Singleton singleton = null;

    private Singleton(){}
    public static Singleton getInstance() {
        if(singleton==null) {
            singleton=new Singleton();
        }
        return singleton;
    }
    public void doSomething(){
        System.out.println("Doing something.");
    }
}
