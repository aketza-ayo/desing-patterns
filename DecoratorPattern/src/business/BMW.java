package business;

/**
 * Defines an object of which an extra reposability can be added
 */
public class BMW extends Car {
    @Override
    public int getPrice() {
        return 26000;
    }

    @Override
    public String getDescription() {
        return "BMW X1 Sports Edition Automatic";
    }
}
