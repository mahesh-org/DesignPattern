/** * Java program to demonstrate where to use Volatile keyword in Java.
 * * In this example Singleton Instance is declared as volatile variable to ensure
 * * every thread see updated value for _instance.
 * *
 *  volatile keyword in java guarantees that value of the volatile variable will always be read from main memory
 *  A volatile variable can be used as an alternative way of achieving synchronization in Java
 * */
public class SingletonUsingVolatile {

    private static volatile SingletonUsingVolatile _instance;     //volatile variable

    public static SingletonUsingVolatile getInstance() {
        if (_instance == null) {
            synchronized (SingletonUsingVolatile.class) {
                if (_instance == null) {
                    _instance = new SingletonUsingVolatile();
                }
            }
        }
        return _instance;
    }
}

