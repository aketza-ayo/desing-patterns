public class Isosceles extends Triangle {

    public Isosceles(int sideA, int sideB, int sideC){
        super(sideA, sideB,sideC);
    }

    @Override
    public String getDescription() {
        return "This is an Isosceles Triangle because it has two equal sides";
    }

    @Override
    public double getSurface() {
        // TODO - here the algorithm to calculate the surface the isosceles triangle
        return 0;
    }

    @Override
    public void draw() {
        // TODO - here the algorithm to draw the isosceles triangle
    }
}
