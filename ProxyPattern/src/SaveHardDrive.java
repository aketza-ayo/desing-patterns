import java.util.List;

/**
 * This is the real object class used in the proxy example
 */
public class SaveHardDrive implements ISave {

    @Override
    public void save(List data) {
        System.out.println("Saving data into the Hard Drive...");
    }
}
