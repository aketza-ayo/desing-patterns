public abstract class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC){
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public abstract String getDescription();

    public abstract double getSurface();

    public abstract void draw();

    public int getSideA(){
        return this.sideA;
    }

    public void setSideA(int sideA){
        this.sideA = sideA;
    }

    public int getSideB(){
        return this.sideB;
    }

    public void setSideB(int sideB){
        this.sideB = sideB;
    }

    public int getSideC(){
        return this.sideC;
    }

    public void setSideC(int sideC){
        this.sideC = sideC;
    }
}
