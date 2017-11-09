/**
 * This class is the concrete implementation of the authoriser.
 * It is resposible to handling the request that can authorise.
 * If it can handle the loan requested it will do so otherwise it will delegate the resposability to somebody else
 */
public class Manager implements IAuthoriser {

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
        if(amount > 50000 && amount <= 100000){
            System.out.println("Request handled by the manager");
        }else{
            nextAuthoriser.requestLoan(amount);
        }
    }
}
