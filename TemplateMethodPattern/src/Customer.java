/**
 * This is the concrete class that implements the abstract method from its base class to follow the steps of the
 * algorithm that are specific of the subclass.
 */
public class Customer extends Person {

    private int customerNumber;

    public Customer(int customerNumber){
        setCustomerNumber(customerNumber);
    }

    @Override
    public String getNumber() {
        return String.valueOf(customerNumber);
    }

    @Override
    public String getTypeId() {
        return "customer number";
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }
}
