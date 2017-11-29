public class FactoryRedPlasma extends AbstractFactoryTv {
    @Override
    public TV createTv() {
        return new Plasma();
    }

    @Override
    public Colour createColour() {
        return new Red();
    }
}
