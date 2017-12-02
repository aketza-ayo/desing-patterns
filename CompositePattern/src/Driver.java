/**
 * This is the Client class. Manipulates objects in the composition through the Component interface. The clients
 * use the interface Employee to interact with objects of the Composite structure.
 */
public class Driver {

    public static void main(String[] args) {
        //building up the company hierarchy
        Employee matt = new Developer("Developer","Matt", 40000.0);
        Employee manu = new Developer("Developer","Manu", 45000.0);

        Employee unai = new Manager("Manager","Unai", 50000.0);
        unai.add(matt);
        unai.add(manu);

        Employee amy = new Developer("Operations","Amy", 50000.0);

        Manager aketza = new Manager("CTO","Aketza", 60000.0);
        aketza.add(unai);
        aketza.add(amy);

        //print
        aketza.print();
    }


}
