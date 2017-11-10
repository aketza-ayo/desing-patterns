import java.util.List;

/**
 * This is the proxy class that controls the creation and access of the real objects
 */
public class SaveDataProxy implements ISave {
    @Override
    public void save(List data) {

        if(ConnectionManager.isConnected()){
            new RemoteObject().save(data);
        }else{
            new SaveHardDrive().save(data);
        }

    }
}
