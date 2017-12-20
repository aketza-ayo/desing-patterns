public class InitialState implements State {
    @Override
    public void pullLink(ChainContext link) {
        link.setState(new LowState());
        System.out.println( "   low speed" );
    }
}
