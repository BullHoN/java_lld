package parking_lot;

public class Ticket {
	private int id;
	private ParkingSpot parkingSpot;
	private long startTime;
	
	public Ticket(int id, ParkingSpot parkingSpot, long startTime) {
		this.id = id;
		this.parkingSpot = parkingSpot;
		this.startTime = startTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	
}
