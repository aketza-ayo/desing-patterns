/**
 * This class creates an concrete command object and specifies its receiver. An invoker object stores the concrete command
 * object. The invoker sends a request calling the execute method over the request. This is achieved by calling the run
 * method on the invoker object.
 *
 * The concrete command object invokes operations on its receiver to carry out the request. These are the operations specified in
 * the IServer concretion.
 */
public class Driver {

    public static void main(String[] args) {
        Command command = new SwitchOn(new UKServer());
        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
