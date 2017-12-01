/**
 * Defines an object of a product that the corresponding concrete factory is responsible to create. At the same
 * time of implementing the interface of the abstract product.
 */
public class Blue extends Colour {

    private boolean isPrimary;

    @Override
    public void paint(TV tv) {
        System.out.println("Painting blue the " + tv.getDescription() );
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

}
