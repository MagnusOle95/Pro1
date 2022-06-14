package Patterns.observer.urpush;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
}
