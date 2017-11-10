/**
 * This is the utility class used in the proxy example
 */
public class ConnectionManager {

    private static boolean hasConnection;

    public ConnectionManager(){
        hasConnection = false;
    }

    public static void connect(){
        hasConnection = true;
    }

    public static void disconnect(){
        hasConnection = false;
    }

    public static boolean isConnected(){
        return hasConnection;
    }
}
