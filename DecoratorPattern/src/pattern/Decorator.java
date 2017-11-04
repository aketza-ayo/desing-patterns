package pattern;

import business.IComponent;

public abstract class Decorator implements IComponent {
    private IComponent component;

    public Decorator(IComponent extras){
        component = extras;
    }


    public IComponent getComponent() {
        return component;
    }

    public void setComponent(IComponent component) {
        this.component = component;
    }
}
