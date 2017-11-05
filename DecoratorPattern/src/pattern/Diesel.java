package pattern;

import business.IComponent;

/**
 * The add-on decorator
 */
public class Diesel extends Decorator{

    public Diesel(IComponent extra){
        super(extra);
    }

    @Override
    public int getPrice() {
        return getComponent().getPrice() + 1500;
    }

    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + Turbo Diesel Injection TDI";
    }
}
