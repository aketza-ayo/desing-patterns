/**
 * This class is a convenience class for handling the TV and Colour factories.
 */
public class AssembleTV {

    public AssembleTV(AbstractFactoryTv factory){
        Colour colour = factory.createColour();
        TV tv = factory.createTv();
        colour.paint(tv);
    }
}
