package parking_lot;
import java.util.List;

public interface SpotAlignmentStrategy {
	ParkingSpot findSpot(Vehicle vehicle,int entranceId,List<ParkingSpot> availableSpot);
}
