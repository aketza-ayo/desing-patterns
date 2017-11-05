package pattern;

import business.IComponent;

/**
 * This decorator class has-a reference to the object IComponent and defines an interface in accordance to the IComponent interface
 */
public abstract class Decorator implements IComponent {
    private IComponent component;

    public Decorator(IComponent car){
        component = car;
    }


    public IComponent getComponent() {
        return component;
    }

    public void setComponent(IComponent component) {
        this.component = component;
    }
}
