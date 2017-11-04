package pattern;

import business.IComponent;

public class Bluetooth extends  Decorator{


    public Bluetooth(IComponent extra) {
        super(extra);
    }

    @Override
    public int getPrice() {
        return getComponent().getPrice() + 200;
    }

    @Override
    public String getDescription() {
        return getComponent().getDescription() + " + Bluethooth Connectivity";
    }
}
