package strategy_practice;

public class NormalVehicle extends Vehicle{
	
	public NormalVehicle() {
		super(new NormalDriveStrategy());
	}
	
}
