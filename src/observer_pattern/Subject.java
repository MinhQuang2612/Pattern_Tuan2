package observer_pattern;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObservers();
    void setMessage(String message);
}
