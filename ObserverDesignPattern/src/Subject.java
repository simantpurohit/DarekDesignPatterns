// This interface handles adding, deleting and updating
// all observers 
//This new comment was added to test

public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
	
}