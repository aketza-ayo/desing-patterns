/**
 * Defines an object of a product that the corresponding concrete factory is responsible to create. At the same
 * time of implementing the interface of the abstract product.
 */
public class Plasma extends TV {

    private double visionAngle;
    private double responseTime;

    public Plasma(){
        setDescription("Plasma");
    }

    public Plasma(String brand, int inches, String colour, String description, double cost, double visionAngle, double responseTime){
        super(brand, inches, colour, description, cost);
        setVisionAngle(visionAngle);
        setResponseTime(responseTime);
    }

    public double getVisionAngle() {
        return visionAngle;
    }

    public void setVisionAngle(double visionAngle) {
        this.visionAngle = visionAngle;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(double responseTime) {
        this.responseTime = responseTime;
    }
}
