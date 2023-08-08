package Models;

import Models.enums.ParkingSpotStatus;
import Models.enums.VehicleType;

public class ParkingSlot extends BaseModels {
    private String number;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType supportedVehicleType;
}
