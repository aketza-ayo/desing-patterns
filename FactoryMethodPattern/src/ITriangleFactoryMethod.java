/**
 * With the abstract class Triangle and the concrete classes Triangle there is a drawback an that is: whoever creates
 * a type of Triangle should not know how it is internally constructed. For that reason, we create the class TriangleFactory
 * and the corresponding interface below.
 * */
public interface ITriangleFactoryMethod  {

    public Triangle createTriangle(int sideA, int sideB, int sideC);
}
