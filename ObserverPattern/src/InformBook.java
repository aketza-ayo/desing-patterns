import java.util.ArrayList;
import java.util.List;

public class InformBook implements Subject {

    private static List<IBookDamagedCondition> observers = new ArrayList<IBookDamagedCondition>();

    @Override
    public void register(IBookDamagedCondition observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(IBookDamagedCondition observer) {
        observers.remove(observers);
    }

    @Override
    public void notifyObservers() {

        for(IBookDamagedCondition observer : observers){
            observer.update();
        }
    }
}
