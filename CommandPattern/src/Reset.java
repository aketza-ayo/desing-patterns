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
