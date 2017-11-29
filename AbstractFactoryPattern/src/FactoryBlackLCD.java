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
