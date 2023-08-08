package Models;

import java.util.Date;

public class Ticket extends BaseModels{
    private Date entryTime;
    private ParkingSlot assignedParkingSlot;
    private Vehicle vehicle;
    private Gate entry;
    private Operator operator;
}
