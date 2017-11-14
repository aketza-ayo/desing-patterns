public class UKServer implements IServer {
    @Override
    public void shutDown() {
        System.out.println("Shutting down server in UK");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on server in UK");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to server in UK");
    }

    @Override
    public void checkConnection() {
        System.out.println("Checking server in UK");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection in the UK");
    }

    @Override
    public void saveLog() {
        System.out.println("Saving UK logs");
    }
}
