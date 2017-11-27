import java.util.Scanner;

public class Driver {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        TriangleFactory factory = new TriangleFactory();
//        Triangle triangle = factory.createTriangle(10,10,10);
//        System.out.println(triangle.getDescription());

        TriangleFactory factory = new TriangleFactory();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("The following class is going to create a Triangle with the help of a factory method design method");
        System.out.println("-------------------------------------------------------------------------------------------------");

        int option = 1;

        do{
            System.out.println("\nPlease enter the length for one of the sides and hit enter ");
            int sideA = sc.nextInt();

            System.out.println("\nPlease enter the other side");
            int sideB = sc.nextInt();

            System.out.println("\nPlease enter the last side of the triangle");
            int sideC = sc.nextInt();

            Triangle triangle = factory.createTriangle(sideA,sideB,sideC);
            System.out.println("-> " + triangle.getDescription());

            System.out.println("\nWould you like to create another Triangle? (Press any number key to continue or 0 to exit)");
            option = sc.nextInt();

        }while(option != 0);


        System.out.println("\nThanks for using the triangle factory method\nBye");
    }
}
