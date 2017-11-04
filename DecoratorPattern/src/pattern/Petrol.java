package pattern;

import business.IComponent;

public class Petrol extends Decorator {

    public Petrol(IComponent extra){
        super(extra);
    }

    @Override
    public int getPrice() {
        return getComponent().getPrice() + 1200;
    }

    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + Petrol 95/98";
    }
}
