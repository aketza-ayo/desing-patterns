/**
 * Declares an interface for the objects of a type of product
 */
public abstract class Colour {

    private String description;

    public abstract void paint(TV tv);

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
