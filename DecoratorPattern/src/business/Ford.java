package business;

/**
 * Defines an object of which an extra reposability can be added
 */
public class Ford extends Car {
    @Override
    public int getPrice() {
        return 18000;
    }

    @Override
    public String getDescription() {
        return "Ford Focus 1.6 Zetec Manual";
    }
}
