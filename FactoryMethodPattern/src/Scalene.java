public class Scalene extends Triangle {

    public Scalene(int sideA, int sideB, int sideC){
        super(sideA, sideB, sideC);
    }

    @Override
    public String getDescription() {
        return "This is a Scalene Triangle because it has no equal sides";
    }

    @Override
    public double getSurface() {
        // TODO - here the algorithm to calculate the surface the scalene triangle
        return 0;
    }

    @Override
    public void draw() {
        // TODO - here the algorithm to draw the scalene triangle
    }
}
