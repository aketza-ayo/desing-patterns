public class Animal {

    private Strategy strategy;

    public void setStrategy(Strategy algorithm){
        this.strategy = algorithm;
    }

    public void performAction(){
        this.strategy.performAction();
    }
}
