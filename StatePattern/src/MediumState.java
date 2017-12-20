public class MediumState implements State {
    @Override
    public void pullLink(ChainContext link) {
        link.setState(new HighState());
        System.out.println( "   high speed" );
    }
}
