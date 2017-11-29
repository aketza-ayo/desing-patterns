public class LCD extends TV {

    private double costOfFabrication;

    public LCD(){
        setDescription("LCD");
    }

    public LCD(String brand, int inches, String colour, String description, double price, double cost){
        super(brand, inches, colour, description, price);
        setCostOfFabrication(cost);
    }

    public double getCostOfFabrication() {
        return costOfFabrication;
    }

    public void setCostOfFabrication(double costOfFabrication) {
        this.costOfFabrication = costOfFabrication;
    }
}
