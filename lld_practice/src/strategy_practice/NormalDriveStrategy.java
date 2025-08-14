package strategy_practice;

public class NormalDriveStrategy implements DriveStrategy{
	
	@Override
	public void drive() {
		System.out.println("Normal Drive Strategy");
	}
}
