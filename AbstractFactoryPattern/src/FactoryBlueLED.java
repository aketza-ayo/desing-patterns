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
