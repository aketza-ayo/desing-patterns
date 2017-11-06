public class Driver {
    public static void main(String[] args) {
        System.out.println("Creating a dolphin");
        Animal dolphin = new Animal();
        dolphin.setStrategy(new Swim());
        dolphin.performAction();
        System.out.println("-------------------------");
        System.out.println("Creating a bird");
        Animal bird = new Animal();
        dolphin.setStrategy(new Fly());
        dolphin.performAction();
        System.out.println("--------------------------");
        System.out.println("Creating a human");
        Animal human = new Animal();
        dolphin.setStrategy(new Speak());
        dolphin.performAction();
        dolphin.setStrategy(new Fly());
        dolphin.performAction();
        dolphin.setStrategy(new Swim());
        dolphin.performAction();
    }
}
