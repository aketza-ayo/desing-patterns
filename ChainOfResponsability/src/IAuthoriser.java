/**
 * This interface handles the requests when implementing the link to the next authoriser.
 */
public interface IAuthoriser {

    public void setNext(IAuthoriser authoriser);

    public IAuthoriser getNext();

    public void requestLoan(int amount);
}
