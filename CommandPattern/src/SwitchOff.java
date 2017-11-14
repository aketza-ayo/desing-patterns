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
