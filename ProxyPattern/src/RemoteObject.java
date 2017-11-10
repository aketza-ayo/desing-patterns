import java.util.List;

/**
 * This is the other real object class used in the proxy example
 */
public class RemoteObject implements ISave {
    @Override
    public void save(List data) {
        System.out.println("Saving data in the remote object...");
    }
}
