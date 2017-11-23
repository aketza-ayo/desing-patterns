/**
 * This pattern is in favour of reusing the code by inheritance. The structure is inverted in a way that the superclass
 * invokes the methods of the concrete subclasses
 */
public class Driver {

    public static void main(String[] args) {

        System.out.println("The client says: ");
        Person p1 = new Client(123);
        System.out.println(p1.identify());

        System.out.println("\nThe employee says: ");
        Person p2 = new Employee(676);
        System.out.println(p2.identify());

        System.out.println("\nThe customer says: ");
        Person p3 = new Customer(2842);
        System.out.println(p3.identify());
    }

}
