package parking_lot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {

	private List<Floor> floors;
	
	private String name;
	private SpotAlignmentStrategy spotAlignmentStrategy;
	
	ParkingSpot findSpot(Vehicle vehicle,int entranceId) {
		List<ParkingSpot> availableSpots = new ArrayList<>();
		for(Floor floor : floors) {
			availableSpots.addAll(floor.getAvailableSpots(vehicle.getType()));
		}
		
		return spotAlignmentStrategy.findSpot(vehicle, entranceId, availableSpots);
	}
	
	void freeSpot(ParkingSpot spot) {
		spot.removeVehicle();
	}
	
	
}
