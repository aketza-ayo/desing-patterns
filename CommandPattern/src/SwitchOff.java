/**
 * This is the concrete implementation of the Command subclass. It defines a link in between a receiver object and an action.
 * Implements the execute method by invoking the appropriate operations of the receiver
 */
public class SwitchOff implements Command{

    private IServer server;

    public SwitchOff(IServer server){
        this.server = server;
    }


    @Override
    public void execute() {
        server.connect();
        server.checkConnection();
        server.saveLog();
        server.shutDown();
        server.closeConnection();
    }
}
