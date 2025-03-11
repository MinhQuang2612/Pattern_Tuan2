package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class ClassLeader implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String message;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
		notifyAllObservers();
	}
}
