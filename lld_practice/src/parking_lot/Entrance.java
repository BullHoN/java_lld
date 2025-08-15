package parking_lot;

import java.util.Date;

public class Entrance {
	int entranceId;
	ParkingLotManager pLotManager;
	
	public Ticket getTicket(Vehicle vehicle) {
		ParkingSpot parkingSpot = pLotManager.findSpot(vehicle, entranceId);
		if(parkingSpot == null) {
			System.out.println("No Parking SPots Available");
			return null;
		}
		
		parkingSpot.addVehicle(vehicle);
		Ticket ticket = new Ticket(1, parkingSpot, new Date().getTime());
		return ticket;
	}
}
