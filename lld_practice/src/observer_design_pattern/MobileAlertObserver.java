package observer_design_pattern;

public class MobileAlertObserver implements Observer{
	
	private IphoneObserableImpl obj;
	private String phoneNo;
	
	public MobileAlertObserver(String phoneNo,IphoneObserableImpl obj) {
		this.obj = obj;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Sending updates to " + phoneNo);
	}
}
