package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModels{
    private Gate exitGate;
    private Operator operator;
    private int amount;
    private Date exitTime;
    private Ticket ticket;
    private String invoiceNumber;

    private List<Payment> payments;

}
