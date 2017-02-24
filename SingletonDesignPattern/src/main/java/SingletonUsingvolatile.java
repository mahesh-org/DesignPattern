/** * Java program to demonstrate where to use Volatile keyword in Java.
 * * In this example Singleton Instance is declared as volatile variable to ensure
 * * every thread see updated value for _instance.
 * *
 *  volatile keyword in java guarantees that value of the volatile variable will always be read from main memory
 *  A volatile variable can be used as an alternative way of achieving synchronization in Java
 * */
public class SingletonUsingvolatile {

    private static volatile SingletonUsingvolatile _instance;     //volatile variable

    public static SingletonUsingvolatile getInstance() {
        if (_instance == null) {
            synchronized (SingletonUsingvolatile.class) {
                if (_instance == null) {
                    _instance = new SingletonUsingvolatile();
                }
            }
        }
        return _instance;
    }
}

