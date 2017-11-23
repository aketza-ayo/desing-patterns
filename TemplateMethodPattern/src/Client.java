/**
 * This is the concrete class that implements the abstract method from its base class to follow the steps of the
 * algorithm that are specific of the subclass.
 */
public class Client extends Person {

    private int clientNumber;

    public Client(int clientNumber){
        setClientNumber(clientNumber);
    }

    @Override
    public String getNumber() {
        return String.valueOf(clientNumber);
    }

    @Override
    public String getTypeId() {
        return "client number";
    }

    public int getClientNumber(){
        return this.clientNumber;
    }

    public void setClientNumber(int clientNumber){
        this.clientNumber = clientNumber;
    }
}
