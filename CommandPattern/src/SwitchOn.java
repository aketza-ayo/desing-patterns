public class SwitchOn implements Command {

    private IServer server;

    public SwitchOn(IServer server){
        this.server = server;
    }


    @Override
    public void execute() {
        server.connect();
        server.checkConnection();
        server.turnOn();
        server.saveLog();
        server.closeConnection();
    }
}
