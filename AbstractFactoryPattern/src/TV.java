/**
 * Declares an interface for the objects of a type of product
 */
public abstract class TV {

    private String brand;
    private int inches;
    private String colour;
    private String description;
    private double price;

    public TV(){}

    public TV(String brand, int inches, String colour, String description, double price){
        this.brand = brand;
        this.inches = inches;
        this.colour = colour;
        this.description = description;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
