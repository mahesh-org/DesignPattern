/**
 * static field Singleton intialized during classloading
 *
 * This is one of my favorite method to impelemnt Singleton pattern in Java,
 */
public class SingletonUsingStatic {

    //initailzed during class loading
    private static final SingletonUsingStatic INSTANCE = new SingletonUsingStatic();

    //to prevent creating another instance of Singleton
    private SingletonUsingStatic(){}

    public static SingletonUsingStatic getSingleton(){
        return INSTANCE;
    }
}
