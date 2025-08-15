package parking_lot;

import java.util.List;

public class DefaultSpotAlignmentStrategy implements SpotAlignmentStrategy{

	@Override
	public ParkingSpot findSpot(Vehicle vehicle, int entranceId, List<ParkingSpot> availableSpot) {
		return availableSpot.get(0);
	}
	
}
