public class LowState implements State {
    @Override
    public void pullLink(ChainContext link) {
        link.setState(new MediumState());
        System.out.println( "   medium speed" );
    }
}
