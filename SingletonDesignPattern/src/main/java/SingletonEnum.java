/**
 * Created by Maheshwar Muttal on 2/24/2017.
 */
public enum SingletonEnum {
    INSTANCE;

    public void doStuff(){
        System.out.println("Singleton using Enum");
    }

    //readResolve to prevent another instance of Singleton
    private Object readResolve(){
        return INSTANCE;
    }

}
