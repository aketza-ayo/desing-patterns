/**
 * This is another concrete implementation of the Command subclass. It defines a link in between a receiver object and an action.
 * Implements the execute method by invoking the appropriate operations of the receiver
 */
public class Reset implements Command {

    private IServer server;

    public Reset(IServer server){
        this.server = server;
    }


    @Override
    public void execute() {
        server.connect();
        server.checkConnection();
        server.saveLog();
        server.shutDown();
        server.turnOn();
        server.saveLog();
        server.closeConnection();
    }
}
