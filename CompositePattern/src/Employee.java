/**
 * This is the Component class that declares interface for objects in composition and also
 * declares an interface for manipulating the parent nodes in the structure recursively.
 * It declares an interface for accessing and managing its child components.
 */
public interface Employee {

    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public String getStatus();
    public String getName();
    public double getSalary();
    public void print();
}