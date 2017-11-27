public class Equilateral extends Triangle {

    public Equilateral(int sideA, int sideB, int sideC){
        super(sideA, sideB, sideC);
    }

    @Override
    public String getDescription() {
        return "This is an Equilateral Triangle because all sides are the same";
    }

    @Override
    public double getSurface() {
        // TODO - here the algorithm to calculate the surface the equilateral triangle
        return 0;
    }

    @Override
    public void draw() {
        // TODO - here the algorithm to draw the equilateral triangle
    }
}
