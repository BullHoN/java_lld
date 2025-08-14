package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserableImpl implements StockObserable{

	private List<Observer> objs;
	private int stocks;
	
	public IphoneObserableImpl() {
		this.objs = new ArrayList<>();
	}
	
	@Override
	public void add(Observer obj) {
		objs.add(obj);
	}
	
	@Override
	public void remove(Observer obj) {
		objs.add(obj);
	}
	
	@Override
	public void notify_observers() {
		for(Observer obj : objs) {
			obj.update();
		}
	}
	
	public void update_stocks(int newStocks) {
		if(stocks == 0) {
			notify_observers();
		}
		this.stocks = newStocks;
	}
	
	
}
