public class Book {
    private String title;
    private BookCondition condition;

    public String getTitle(){
        return title;
    }

    public void setTile(String title){
        this.title = title;
    }

    public BookCondition getCondition() {
        return condition;
    }

    public void setCondition(BookCondition condition){
        this.condition = condition;
    }
}
