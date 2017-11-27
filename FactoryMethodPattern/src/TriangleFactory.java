/**
* The TriangleFactory implements the createTriangle() method where the logic for deciding which triangle tpo create is located.
* */
public class TriangleFactory implements ITriangleFactoryMethod {

    @Override
    public Triangle createTriangle(int sideA, int sideB, int sideC) {

        if(sideA == sideB && sideB == sideC){
            return new Equilateral(sideA, sideB, sideC);

        }else if(sideA != sideB && sideB != sideC && sideA != sideC){
            return new Scalene(sideA, sideB, sideC);

        }else{
            return new Isosceles(sideA, sideB, sideC);
        }
    }
}
