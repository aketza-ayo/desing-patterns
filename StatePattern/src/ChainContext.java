public class ChainContext {

    private State current;

    public ChainContext(){
        current = new InitialState();
    }

    public void setState(State state){
        current = state;
    }

    public void pullLink(){
        current.pullLink(this);
    }
}
