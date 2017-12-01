/**
 * This is the concrete factory class. It implements the operations for the creation of the objects of the
 * concrete products
 */
public class FactoryBlackLCD extends AbstractFactoryTv {

    @Override
    public TV createTv() {
        return new LCD();
    }

    @Override
    public Colour createColour() {
        return new Black();
    }
}
