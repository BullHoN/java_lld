package parking_lot;

public class Vehicle {
	String plate;
	VehicleType type;
	
	public Vehicle(String plate, VehicleType type) {
		super();
		this.plate = plate;
		this.type = type;
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	
	
}
