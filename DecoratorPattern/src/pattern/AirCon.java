package pattern;

import business.IComponent;

/**
 * An add-on decorator that adds behavious to the Car object
 */
public class AirCon extends Decorator {

    public AirCon(IComponent extra){
        super(extra);
    }

    @Override
    public int getPrice() {
        return getComponent().getPrice() + 1000;
    }

    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + Air Conditioning";
    }
}
