package Patterns.observer.boghandel_Min_Opgave;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
}
