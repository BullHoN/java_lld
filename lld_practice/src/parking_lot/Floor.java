package parking_lot;

import java.util.*;
import java.util.stream.Collectors;

public class Floor {
	private int floorId;
	private Map<SpotType,List<ParkingSpot>> parkingSpots;
	
	public Floor(int floorId, List<ParkingSpot> spots) {
		this.floorId = floorId;
		parkingSpots = new HashMap<SpotType, List<ParkingSpot>>();
		for(ParkingSpot ps : spots) {
            SpotType type = ps.getSpotType();
            parkingSpots.computeIfAbsent(type, k -> new ArrayList<>()).add(ps);
		}
	}
	
	
	public List<ParkingSpot> getAvailableSpots(VehicleType vehicleType){
		SpotType spotType = pickCorrectSlot(vehicleType);
	    List<ParkingSpot> spots = parkingSpots.get(spotType);
	    if (spots == null) return Collections.emptyList();

		return spots.stream()
				.filter(spot -> spot.isFree())
				.collect(Collectors.toList());
	}
	
	private SpotType pickCorrectSlot(VehicleType vehicleType) {
		if(vehicleType.equals(VehicleType.CAR)) return SpotType.CAR_PARKING;
		if(vehicleType.equals(VehicleType.BIKE)) return SpotType.BIKE_PARKING;
		if(vehicleType.equals(VehicleType.TRUCK)) return SpotType.TRUCK_PARKING;
		return null;
	}
}
