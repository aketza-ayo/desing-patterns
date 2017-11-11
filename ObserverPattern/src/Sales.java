public class Sales implements IBookDamagedCondition {
    @Override
    public void update() {
        System.out.println("Sales -> Request a new quotation");
    }
}
