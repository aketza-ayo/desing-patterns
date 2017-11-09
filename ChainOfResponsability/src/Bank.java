public class Bank implements IAuthoriser {

    private IAuthoriser nextAuthoriser;

    @Override
    public void setNext(IAuthoriser authoriser) {
        nextAuthoriser = authoriser;
    }

    @Override
    public IAuthoriser getNext() {
        return nextAuthoriser;
    }

    @Override
    public void requestLoan(int amount) {
        BranchEmployee employee = new BranchEmployee();
        this.setNext(employee);

        TeamLeader leader = new TeamLeader();
        employee.setNext(leader);

        Manager manager = new Manager();
        leader.setNext(manager);

        Director director = new Director();
        manager.setNext(director);

        nextAuthoriser.requestLoan(amount);
    }
}
