package observer_design_pattern;

public class EmailAlertObserver implements Observer{
	
	private IphoneObserableImpl obj;
	private String email;
	
	public EmailAlertObserver(String email,IphoneObserableImpl obj) {
		this.obj = obj;
		this.email = email;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Sending email to " + email);
	}

}
