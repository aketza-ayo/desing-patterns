/**
 * This class is the equivalent of a client and only uses the interfaces declares in the factory and in the
 * abstract products.
 */
public class Driver {

    public static void main(String[] args) {
        //assembling the Black LCD
        AbstractFactoryTv factory1 = new FactoryBlackLCD();
        AssembleTV assemble1 = new AssembleTV(factory1);

        //assembling the Blue LED
        AbstractFactoryTv factory2 = new FactoryBlueLED();
        AssembleTV assemble2 = new AssembleTV(factory2);

        //assembling the Red Plasma
        AbstractFactoryTv factory3 = new FactoryRedPlasma();
        AssembleTV assemble3 = new AssembleTV(factory3);

    }
}
