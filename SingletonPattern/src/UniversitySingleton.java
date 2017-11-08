/**
 * This Singleton class defines an instance for the consumers to make use of it. This instance is accessed by a class
 * method. The consumers that want to access the Singleton object do it by accessing the unique method called
 * getInstance().
 *
 * The singleton class is commonly used for configuration tables or connection pools. Where the number of connections are
 * limited within the pool.
 *
 * Note: what will happen if two threads call the getInstance() at the same time? There might be a problem if that is the
 * case. In that case just add synchronize keyword in the method
 */
public class UniversitySingleton {

    private String name;

    /**
     * Make it static so that it is globally accessible
     */
    private static UniversitySingleton firstInstance = null;

    /**
     * The constructor is made private because the only way to get an instance of the object is by invoking the method
     * getInstance()
     */
    private UniversitySingleton(){}

    /**
     * This is the naming convention for the getting the singleton object.
     * Uses lazy instantiation - the object is initialized when is needed
     */
    public static synchronized UniversitySingleton getInstance(){

        if(firstInstance == null){

//            synchronized(UniversitySingleton.class){

                firstInstance = new UniversitySingleton();

//            }

        }

        return firstInstance;
    }


    /**
     * This method is used purely for example purposes in the Driver class
     */
    public String getSingletonName(){
        return this.name;
    }


    /**
     * This method is used purely for example purposes in the Driver class
     */
    public void setSingletonName(String name){
        this.name = name;
    }
}
