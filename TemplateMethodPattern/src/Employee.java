/**
 * This is the concrete class that implements the abstract method from its base class to follow the steps of the
 * algorithm that are specific of the subclass.
 */
public class Employee extends Person {

    private int employeeNumber;

    public Employee(int employeeNumber){
        setEmployeeNumber(employeeNumber);
    }

    @Override
    public String getNumber() {
        return String.valueOf(employeeNumber);
    }

    @Override
    public String getTypeId() {
        return "employee number";
    }

    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber = employeeNumber;
    }


}
