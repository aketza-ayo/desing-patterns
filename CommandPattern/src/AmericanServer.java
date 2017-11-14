public class AmericanServer implements IServer {
    @Override
    public void shutDown() {
        System.out.println("Shutting down server in America");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on server in America");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to server in America");
    }

    @Override
    public void checkConnection() {
        System.out.println("Checking server in America");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection in America");
    }

    @Override
    public void saveLog() {
        System.out.println("Saving American logs");
    }
}
