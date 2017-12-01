/**
 * Defines an object of a product that the corresponding concrete factory is responsible to create. At the same
 * time of implementing the interface of the abstract product.
 */
public class Red extends Colour{

    private boolean isPrimary;

    @Override
    public void paint(TV tv) {
        System.out.println("Painting red the " + tv.getDescription() );
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }
}
