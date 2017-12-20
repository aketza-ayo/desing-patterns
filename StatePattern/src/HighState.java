public class HighState implements State {
    @Override
    public void pullLink(ChainContext link) {
        System.out.println( "   reached the top speed (Press 0 to exit)" );
    }
}

