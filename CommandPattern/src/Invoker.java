/**
 * This class asks the command object to execute the request
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
