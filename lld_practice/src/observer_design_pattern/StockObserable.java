package observer_design_pattern;

public interface StockObserable {
	public void add(Observer obj);
	public void remove(Observer obj);
	public void notify_observers();
}
