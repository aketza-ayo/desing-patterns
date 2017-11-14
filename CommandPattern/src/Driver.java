public class Driver {

    public static void main(String[] args) {
        Command command = new SwitchOn(new UKServer());
        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
