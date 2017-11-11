public class Library {

    public void returnBook(Book book){

        if(book.getCondition().equals(BookCondition.DAMAGED)){
            InformBook inform = new InformBook();
            inform.notifyObservers();
        }
    }
}
