/**
 * This Driver class is the where the main method is and the starting point of the application. The idea of this demo is
 * to show the use of the singleton pattern though an example.
 */
public class Driver {
    public static void main(String[] args) {

        UniversitySingleton uni = UniversitySingleton.getInstance();
        uni.setSingletonName("University of Java");
        System.out.println("1: " + uni.getSingletonName());

        UniversitySingleton uni2 = UniversitySingleton.getInstance();
        System.out.println("2: " + uni2.getSingletonName());

        UniversitySingleton uni3 = UniversitySingleton.getInstance();
        System.out.println("3: " + uni3.getSingletonName());

        uni3.setSingletonName("Oracle University");
        //uni3 changes the name

        System.out.println("\n1 bis: " + uni.getSingletonName());
        System.out.println("2 bis: " + uni2.getSingletonName());
        System.out.println("3 bis: " + uni3.getSingletonName());

    }
}