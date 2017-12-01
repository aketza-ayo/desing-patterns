/**
 * This is the concrete factory class. It implements the operations for the creation of the objects of the
 * concrete products
 */
public class FactoryBlueLED extends AbstractFactoryTv {

    @Override
    public TV createTv() {
        return new LED();
    }

    @Override
    public Colour createColour() {
        return new Blue();
    }
}
