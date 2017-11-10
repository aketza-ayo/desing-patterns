import java.util.ArrayList;
import java.util.List;

/**
 * This class requests the service through the proxy and it's the proxy who communicates with the real objects
 */
public class Driver {
    public static void main(String[] args) {
        List data = new ArrayList();
        data.add("Objects");
        data.add("table data");

        ConnectionManager.connect();
//        ConnectionManager.disconnect();
        SaveDataProxy proxy = new SaveDataProxy();
        proxy.save(data);
    }
}
