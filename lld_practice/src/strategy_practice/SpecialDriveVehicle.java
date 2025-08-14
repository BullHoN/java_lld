package strategy_practice;

public class SpecialDriveVehicle extends Vehicle{

	public SpecialDriveVehicle() {
		super(new SpecialDriveStrategy());
	}
	
}
