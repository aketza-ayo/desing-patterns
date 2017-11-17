/**
 * The different server locations need to implement this interface because each one of the concrete server has its own
 * way for doing things.
 */
public interface IServer {

    public void shutDown();
    public void turnOn();
    public void connect();
    public void checkConnection();
    public void closeConnection();
    public void saveLog();

}
