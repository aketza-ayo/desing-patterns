/**
 * This class implements the IServer and here is where the logic is business logic implemented.
 */
public class EuropeanServer implements IServer {
    @Override
    public void shutDown() {
        System.out.println("Shutting down server in Europe");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on server in Europe");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to server in Europe");
    }

    @Override
    public void checkConnection() {
        System.out.println("Checking server in Europe");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection in Europe");
    }

    @Override
    public void saveLog() {
        System.out.println("Saving European logs");
    }
}
