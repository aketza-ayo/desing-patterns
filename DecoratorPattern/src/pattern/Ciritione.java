package pattern;

import business.IComponent;

public class Ciritione extends Decorator{

    public Ciritione(IComponent extra){
        super(extra);
    }


    @Override
    public int getPrice() {
        return getComponent().getPrice() + 90;
    }

    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + with Ciritione";
    }
}
