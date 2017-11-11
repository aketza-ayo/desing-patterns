public interface Subject {
    public void register(IBookDamagedCondition observer);
    public void unregister(IBookDamagedCondition observer);
    public void notifyObservers();
}
