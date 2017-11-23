/**
 * This class is the abstract template that implements the template method called identify() in this case. This method
 * defines the footprint of an algorithm and defines abstract method that need to be implemented by the concrete subclasses
 * which are Client, Employee and Customer in this example
 */
public abstract class Person {
    private String name;
    private String id;

    public String identify(){
        return "I identify with: " + getTypeId() + ". The number is: " + getNumber();
    }

    public abstract String getNumber();

    public abstract String getTypeId();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
