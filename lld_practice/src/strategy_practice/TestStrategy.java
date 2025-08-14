package strategy_practice;

public class TestStrategy {

	public static void main(String[] args) {
		
		Vehicle nv = new NormalVehicle();
		Vehicle sv = new SpecialDriveVehicle();
		
		nv.drive();
		sv.drive();
	}

}
