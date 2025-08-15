package parking_lot;

public class ParkingSpot {
	
	private int id;
	private SpotType spotType;
	private boolean isFree;
	private Vehicle vehicle;
	
	public ParkingSpot(int id, SpotType spotType) {
		this.id = id;
		this.spotType = spotType;
		this.isFree = false;
		this.vehicle = null;
	}

	public void addVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		isFree = false;
	}
	
	public void removeVehicle() {
		vehicle = null;
		isFree = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SpotType getSpotType() {
		return spotType;
	}

	public void setSpotType(SpotType spotType) {
		this.spotType = spotType;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
