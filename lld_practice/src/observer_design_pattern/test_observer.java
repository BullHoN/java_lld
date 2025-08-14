package observer_design_pattern;

public class test_observer {
	public static void main(String args[]) {
		IphoneObserableImpl iphoneObs = new IphoneObserableImpl();
		EmailAlertObserver eObj = new EmailAlertObserver("vaibhav@gmail.com", iphoneObs);
		MobileAlertObserver mobj = new MobileAlertObserver("1234567890", iphoneObs);
	
		iphoneObs.add(mobj);
		iphoneObs.add(eObj);
	
		iphoneObs.update_stocks(1);
	}
}
