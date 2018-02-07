public interface Subject {
	// add delete and update observers 

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}